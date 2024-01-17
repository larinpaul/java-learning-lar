package exceptionserrorsandtheirhierarchy;

public class ClassHierarchy {

	
//Unchecked //	Throwable {
//Unchecked //		Error {
//Unchecked //			ThreadDeath {}
//Unchecked //			VirtualMachineError {
//Unchecked //				InternalError {}
//Unchecked //				UnknownError {}
//Unchecked //				OutOfMemoryError {}
//Unchecked //				StackOverflowError {}
//	     	//			}
//Unchecked //			AssertionError {}
//Unchecked //		}
//Checked   //		Exception {
//Unchecked //			RuntimeException {
//Unchecked //				ArithmeticException {}
//Unchecked //				NullPointerException {}
//		    //			}
//Checked   //			IOException {
//Checked   //				ObjectStreamException {}
//Checked   //				InvalidClassException {}
//Checked   //				InvalidOjbectExceptioon {}
//          //			}	
//          //		}		
//		    //	}
	
	// Непроверяемые исключения (Unchecked exceptions)
	// компилятор не подсвечивает
	
	// Проверяемые исключения (Checked exceptions)
	// компилятор подсвечивает
	
	// Error:
	// Stack overflow
	// Not enough memory
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
