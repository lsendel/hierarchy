/*  ~*~*~Matrix Meta-Compiled File~*~*~  */

package maintests.samples.jaraccesstests;

import java.util.*;
import java.lang.reflect.Constructor;
import net.unconventionalthinking.lang.*;
import java.util.concurrent.atomic.AtomicBoolean;
import net.unconventionalthinking.reflection.MethodInvoker;

import net.unconventionalthinking.matrix.*;
import net.unconventionalthinking.matrix.symbols.*;
import net.unconventionalthinking.exceptions.*; 


public class AppControl extends AppControl_Base { 

	//  Static initialization Code for appControl instance
	//  Public Static variables __________________________________________
	public static AppControl appControl = null;

	//  Private Static Variables _________________________________________
	private static AtomicBoolean initializationAtLeastStarted = new AtomicBoolean(false);



	//  Static Methods ___________________________________________________

	public static synchronized AppControl_Base initializeApp() {
		return initializeApp(false);
	}

	/**
	 * This version of the initializeApp should not be used when running the application, and is only called by the metacompiler
	 *
	 * @param running_AppControl_forMetacompilation   a boolean value indicating if the current app control is a non-final app Control
	 *                                                running as an intermediate appcontrol for metacompilation.*/
	public static synchronized AppControl_Base initializeApp(boolean running_AppControl_forMetacompilation) {

		try {
			if (!initializationAtLeastStarted.getAndSet(true)) {
				appControl = new AppControl(running_AppControl_forMetacompilation);
			}		} catch (Exception e) {
			throw new ExceptRuntime_Matrix_GeneralError("Tried to create the appControl for the system, but had an error (see inner exception)", e);
		}

		return appControl;
	}

	/**
	 * The version takes an existing, parent app Control, and sets it as the appcontrol for this application context. In other words,
	 * typically, if this method is being called, then this app control is probably a part of a jar file that is being called from a
	 * parent application. This jar's app control should use the parent application's app control.
	 *
	 */
	public static synchronized AppControl_Base initializeApp(AppControl_Base parent_AppControl) {
		    return initializeApp(parent_AppControl, false);
	}

	/**  The version takes an existing, parent app Control, and sets it as the appcontrol for this application context. In other words,
	 * typically, if this method is being called, then this app control is probably a part of a jar file that is being called from a
	 * parent application. This jar's app control should use the parent application's app control.

	 * @param running_AppControl_forMetacompilation   a boolean value indicating if the current app control is 
	 *                                                running as an intermediate appcontrol for metacompilation.*/
	public static synchronized AppControl_Base initializeApp(AppControl_Base parent_AppControl, boolean running_AppControl_forMetacompilation) {
		try {
			if (!initializationAtLeastStarted.getAndSet(true)) {
				appControl = new AppControl(parent_AppControl, running_AppControl_forMetacompilation);
			}		} catch (Exception e) {
			throw new ExceptRuntime_Matrix_GeneralError("Tried to create the appControl for the system, but had an error (see inner exception)", e);
		}

		return appControl;
	}



	//  AppControl Methods ________________________________________________
	public AppControl(boolean running_AppControl_forMetacompilation) 
		throws Exception_SymbolCreation, Exception_Descriptor, Exception_InvalidArgumentPassed, Exception_SchemaInfo, Exception_MatrixRuntime_Checked {

		is_ExternalAppControl = false;
		this.running_AppControl_forMetacompilation = running_AppControl_forMetacompilation;

		executionInfo = new ExecutionInfo();
		symbolControl = new SymbolControl();
		initialize_Symbols();

		//  the schema control uses symbols, so it must be inited after the symbols have been initialized.
		schemaControl = new SchemaControl(executionInfo, this);
		fieldSetTupleSpecialized_Constructor_Index = schemaControl.get_FieldSetTupleSpecialized_Constructor_Index_byTypeSymbol();
		fieldSetTupleSpecialized_ExternalFieldSets_Index__fromClassName_to_ClassObj =
				schemaControl.get_FieldSetTupleSpecialized_ExternalFieldSets_Index__fromClassName_to_ClassObj();
		matrixControl = new MatrixControl(this);

		//  The specialized fieldsets for this jar need to to be added before the externalappcontrols are.
		//  Why? because the external matrix/schema constructors should use the internal app context's specialized fieldsets, not its own
		//  The reason is because all the external fieldset's symbol id's are incorrect.
		initialize_SpecializedFieldSets();
		initialize_ExternalAppControls_List();
		initialize_AppObjects();
	} 

	public AppControl(AppControl_Base parent_AppControl, boolean running_AppControl_forMetacompilation) 
		throws Exception_SymbolCreation, Exception_Descriptor, Exception_InvalidArgumentPassed, Exception_SchemaInfo, Exception_MatrixRuntime_Checked {

		is_ExternalAppControl = true;
		this.running_AppControl_forMetacompilation = running_AppControl_forMetacompilation;

		executionInfo = parent_AppControl.executionInfo;
		symbolControl = parent_AppControl.symbolControl;
		initialize_Symbols();

		schemaControl = parent_AppControl.schemaControl;
		fieldSetTupleSpecialized_Constructor_Index = schemaControl.get_FieldSetTupleSpecialized_Constructor_Index_byTypeSymbol();
		fieldSetTupleSpecialized_ExternalFieldSets_Index__fromClassName_to_ClassObj =
				schemaControl.get_FieldSetTupleSpecialized_ExternalFieldSets_Index__fromClassName_to_ClassObj();
		matrixControl = parent_AppControl.matrixControl;

		//  this is an external app control, so the specialized fieldsets don't need to be initialized, but added to the external fieldSets list
		initialize_SpecializedFieldSets();
		initialize_ExternalAppControls_List();
		initialize_AppObjects();
	} 


	@Override
	public void initialize_AppObjects()
	throws Exception_Descriptor, Exception_InvalidArgumentPassed, Exception_SchemaInfo, Exception_MatrixRuntime_Checked  {

		initialize_StaticSchemas();
		initialize_StaticMatrices();
	}

	@Override
	public void initialize_ExternalAppControls_List() {
		externalAppControl_ClassList = new ArrayList<Class>();

		//  Add the external appControl classes to the externalAppControl_ClassList
		externalAppControl_ClassList.add(maintests.samples.typeinfotest.AppControl.class);
		//  Intialize the list external app controls.

		for (Class externalAppControl_Class : externalAppControl_ClassList) {
			Class[] paramTypes = new Class[] { AppControl_Base.class, boolean.class };
			Object[] paramValues = new Object[] { this, running_AppControl_forMetacompilation };

			try {
				MethodInvoker.invokeMethod_Helper(null, externalAppControl_Class, "initializeApp", new Boolean_Mutable(),
						paramTypes, paramValues );
			} catch (Exception e) {
				throw new ExceptRuntime_Matrix_GeneralError("Tried to initialize the external appcontrol, " +  externalAppControl_Class.getName() +
						", but had an error.", e);
			}
		}

	}




	//  Symbol initializer
	@Override
	public void initialize_Symbols() throws Exception_SymbolCreation {
		try {
			AppSymbols.initialize(symbolControl, is_ExternalAppControl);
			AppSymbols_DescTagName.initialize(symbolControl, is_ExternalAppControl);
			AppSymbols_Label.initialize(symbolControl, is_ExternalAppControl);
			//  Schema Name & Matrix Name must init after DescTagName;
			AppSymbols_SchemaName.initialize(symbolControl, is_ExternalAppControl);
			AppSymbols_MatrixName.initialize(symbolControl, is_ExternalAppControl);
			//  DescTag must init after DescTagName & SchemaName;
			AppSymbols_DescTag.initialize(symbolControl, is_ExternalAppControl);

			//  MP Symbol classes don't need the is_ExternalAppControl value. Why? because they don't use fixed symbol id's 
			symbolControl.intialize_All_MPSymbols();

		} catch(Exception e) {
			throw new Exception_SymbolCreation("Tried to initialize the appSymbols, but had a problem (see inner exception).", e);
		}

	}  //  end of symbol init


	//  FieldSet Class initializer
	//  If this is an external app control, so the specialized fieldsets don't need to be initialized, and this method is not called.
	void initialize_SpecializedFieldSets() {

		//  If this is an external app control to the external fieldSets list.
		if (is_ExternalAppControl) {
			fieldSetTupleSpecialized_ExternalFieldSets_Index__fromClassName_to_ClassObj.put(AppSymbols.FieldSetTuple$95$$95$maintests$36$$95$$95$$36$samples$36$$95$$95$$36$typeinfotest$36$$95$CC$95$$36$WEB$36$$95$$95$$36$FORM$36$$95$S$95$$36$FORM$36$$95$$95$$36$REQUIRED.name_no_backtiks , FieldSetTuple__maintests$__$samples$__$typeinfotest$_CC_$WEB$__$FORM$_S_$FORM$__$REQUIRED.class);
			fieldSetTupleSpecialized_ExternalFieldSets_Index__fromClassName_to_ClassObj.put(AppSymbols.FieldSetTuple$95$$95$maintests$36$$95$$95$$36$samples$36$$95$$95$$36$typeinfotest$36$$95$CC$95$$36$WEB$36$$95$$95$$36$FORM$36$$95$S$95$$36$FORM$36$$95$$95$$36$SELECTOR$36$$95$S$95$$36$OPTION.name_no_backtiks , FieldSetTuple__maintests$__$samples$__$typeinfotest$_CC_$WEB$__$FORM$_S_$FORM$__$SELECTOR$_S_$OPTION.class);
			fieldSetTupleSpecialized_ExternalFieldSets_Index__fromClassName_to_ClassObj.put(AppSymbols.FieldSetTuple$95$$95$maintests$36$$95$$95$$36$samples$36$$95$$95$$36$typeinfotest$36$$95$$95$$36$anotherpackage$36$$95$CC$95$$36$Test$36$$95$$95$$36$Schema$36$$95$S$95$$36$TEST$36$$95$$95$$36$DESC.name_no_backtiks , FieldSetTuple__maintests$__$samples$__$typeinfotest$__$anotherpackage$_CC_$Test$__$Schema$_S_$TEST$__$DESC.class);
			fieldSetTupleSpecialized_ExternalFieldSets_Index__fromClassName_to_ClassObj.put(AppSymbols.FieldSetTuple$95$$95$maintests$36$$95$$95$$36$samples$36$$95$$95$$36$typeinfotest$36$$95$$95$$36$anotherpackage$36$$95$CC$95$$36$Test$36$$95$$95$$36$Schema$36$$95$S$95$$36$TEST$36$$95$$95$$36$DESC$36$$95$S$95$$36$CHILD$36$$95$$95$$36$DESC.name_no_backtiks , FieldSetTuple__maintests$__$samples$__$typeinfotest$__$anotherpackage$_CC_$Test$__$Schema$_S_$TEST$__$DESC$_S_$CHILD$__$DESC.class);

		}

		//  This is a either the appControl for the application (a non-external one) OR
		//  you're creating an external appcontrol that is an appcontrol for metacompilation. In this last situation, we need
		//  to make sure there are constructors in the index for every fieldset. Why? anytime we construct a matrix during metacompilation, we
		//  need to make sure that all the specialized fieldsets exist, EVEN IF THERE THE WRONG ONES! This is okay during metacompilation,
		//  because the contructed matrices don't actually use the specialized fieldsets, they only construct them (which is all we need).
		if (!is_ExternalAppControl || running_AppControl_forMetacompilation) {
			addConstructorForClass(AppSymbols.FieldSetTuple$95$$95$maintests$36$$95$$95$$36$samples$36$$95$$95$$36$typeinfotest$36$$95$CC$95$$36$WEB$36$$95$$95$$36$FORM$36$$95$S$95$$36$FORM$36$$95$$95$$36$REQUIRED , FieldSetTuple__maintests$__$samples$__$typeinfotest$_CC_$WEB$__$FORM$_S_$FORM$__$REQUIRED.class);
			addConstructorForClass(AppSymbols.FieldSetTuple$95$$95$maintests$36$$95$$95$$36$samples$36$$95$$95$$36$typeinfotest$36$$95$CC$95$$36$WEB$36$$95$$95$$36$FORM$36$$95$S$95$$36$FORM$36$$95$$95$$36$SELECTOR$36$$95$S$95$$36$OPTION , FieldSetTuple__maintests$__$samples$__$typeinfotest$_CC_$WEB$__$FORM$_S_$FORM$__$SELECTOR$_S_$OPTION.class);
			addConstructorForClass(AppSymbols.FieldSetTuple$95$$95$maintests$36$$95$$95$$36$samples$36$$95$$95$$36$typeinfotest$36$$95$$95$$36$anotherpackage$36$$95$CC$95$$36$Test$36$$95$$95$$36$Schema$36$$95$S$95$$36$TEST$36$$95$$95$$36$DESC , FieldSetTuple__maintests$__$samples$__$typeinfotest$__$anotherpackage$_CC_$Test$__$Schema$_S_$TEST$__$DESC.class);
			addConstructorForClass(AppSymbols.FieldSetTuple$95$$95$maintests$36$$95$$95$$36$samples$36$$95$$95$$36$typeinfotest$36$$95$$95$$36$anotherpackage$36$$95$CC$95$$36$Test$36$$95$$95$$36$Schema$36$$95$S$95$$36$TEST$36$$95$$95$$36$DESC$36$$95$S$95$$36$CHILD$36$$95$$95$$36$DESC , FieldSetTuple__maintests$__$samples$__$typeinfotest$__$anotherpackage$_CC_$Test$__$Schema$_S_$TEST$__$DESC$_S_$CHILD$__$DESC.class);

		}

	}


	private void addConstructorForClass(Symbol fieldSetTuple_TypeSymbol, Class fieldSetClass) {

		Class[] fieldSetTupleConstructor_ParamTypes = new Class[] { ExecutionInfo.class, Descriptor.class };

		Constructor fieldSetConstructor;

		try {
			fieldSetConstructor = fieldSetClass.getConstructor(fieldSetTupleConstructor_ParamTypes);
		} catch (NoSuchMethodException e) {
			fieldSetConstructor = null;
		}

		if (fieldSetConstructor != null)
			fieldSetTupleSpecialized_Constructor_Index.put(fieldSetTuple_TypeSymbol, fieldSetConstructor);

	}

	//  construct static Schemas
	void initialize_StaticSchemas() throws Exception_MatrixRuntime_Checked {

	}

	//  construct static Matrices
	void initialize_StaticMatrices() throws Exception_MatrixRuntime_Checked {
		maintests.samples.jaraccesstests.Test$__$Matrix2.construct(this, executionInfo);

	}


}
