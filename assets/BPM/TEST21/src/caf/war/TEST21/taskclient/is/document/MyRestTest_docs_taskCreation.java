package caf.war.TEST21.taskclient.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class MyRestTest_docs_taskCreation extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "MyRestTest.docs:taskCreation";

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	private static final String DOCUMENT_SRC = "http://127.0.01:5555";
	private java.lang.String number1;
	private java.lang.String number2;
	public static String[][] FIELD_NAMES = new String[][] {{"number1", "number1"},{"number2", "number2"},{"number3", "number3"},
	};
	private java.lang.String number3;
 
	
	public MyRestTest_docs_taskCreation() {
	}


	public java.lang.String getNumber1()  {
		
		return number1;
	}


	public void setNumber1(java.lang.String number1)  {
		this.number1 = number1;
	}


	public java.lang.String getNumber2()  {
		
		return number2;
	}


	public void setNumber2(java.lang.String number2)  {
		this.number2 = number2;
	}


	public java.lang.String getNumber3()  {
		
		return number3;
	}


	public void setNumber3(java.lang.String number3)  {
		this.number3 = number3;
	}
	
	

}