/*A thread has different states from it's creation, those are:
 * 
 * New                     => The thread has been created but is not executed the start() method.
                           There will appear an error message if you try to execute any method 
                           without start() method
 * Runnable                => When start() method creates the necessary to run the thread and calls 
                           thread's run() method. At this point the state of the thread is runnable
 * Blocked or not runnable => The thread is executing but there is one job or activity that blocks
 * Dead                    => A thread can dead by two ways, natural dead, which occurs when
                           it's run() method finishes normally, the other way will be a murder,
                           it occurs when there is an instruction to finish the thread before it finishes

 */

public class q_Threads_states {

}
