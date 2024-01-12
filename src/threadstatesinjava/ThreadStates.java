package threadstatesinjava;

public class ThreadStates {

	// Thread States in Java
	
	// Every time you create a thread, it goes into the New state
	// Now, apart from the New state, we also have the Runnable state
	// After that, Running state
	// Waiting state (Block state)
	// Dead state
	
	// New
	// Runnable
	// Running
	// Waiting (Block)
	// Dead
	
	// Running - actually running on the CPU
	// Runnable - when the thread is executing but is waiting for the scheduler
	
	// New -> start() -> Runnable
	// Runnable -> run() -> Running
	// Running -> sleep() -> Waiting 
	// Running -> wait() -> Waiting
	// Waiting -> notify() -> Runnable
	// Running -> stop() -> Dead // stop() is DEPRECATED, don't use it!
	// Runnable -> stop() -> Dead // 

	// [New] -> start() -> [Runnable]<\        
	//                      V    V     \notify() <- [Waiting]
	// 					    V  run()                  /\
	// 					    V    V      -> sleep()-> /        
	// 					    V [Running] -> wait()-> /
	//    				    V    V         
	// 					    V	 L______-> stop() -> [Dead]
	// 					    V 						  /\
	// 					    L stop() -> _____________/
	//
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
