package main.kotlin

import kotlin.concurrent.thread

/** Coroutines:
 *
 * What are Coroutines?
 * For this first we need to know how our application work when user
 * launches an application:
 * So, when user launches an application a default thread is created that is
 * main thread. Main thread executes simple and lightweight tasks
 * like arithmetic operations, UI interaction, click of the button or any lightweight
 * operation. So in short on main thread we perform small operations.
 *
 * Now what about long and heavy operations such that required use of internet or
 * uploads or download of a file or loading or running database query or fetching data
 * from network etc. If you perform all of these task on main thread ,your application
 * may get stuck or freeze because your main thread get blocked.
 * So instead of using main thread , we can create a worker thread or the
 * background thread and perform all of these heavy operation on that.
 * So in general you always create a new thread to perform some time taking or heavy operations.
 *
 * But there is a limit of how many background thread you can create at a time
 * in your application because creating thread is very expensive and if you create
 * more and more threads, then there would be a time when your device will
 * run out of memory and eventually your app will shut down.
 * hence creating so many background thread is also not a good solution.
 *
 * So what is the next solution?
 * Now here comes coroutines into the picture.:
 * when you use coroutines then you don't have to create so many threads
 * for each operation. Instead, you have just one background thread,
 * And on this background thread, you can launch coroutines.
 * such as launch a coroutine for uploading files, launch another coroutine on
 * same thread to download files, and another for fetching data from database, etc.
 *
 * In short , with the memory consumption of one background thread, you can
 * perform so many heavy operations. So this is what coroutine does.
 *
 * So coroutines are:
 * > Light-Weight
 * > Like threads, coroutines can run in parallel, wait for each other, and
 * communicate with each other.
 * > But coroutines are not threads.
 * > Coroutines are very cheap-almost free. Create thousands of them without
 * any memory issue. "Best for modern applications".
 *> unlike threads, for coroutine application by default doesn't wait for it to
 *  finish
 *
 * How to use coroutines?
 *> Add the following dependency in build.gradle:
 * implementation  "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9".
 * code:
 */

fun main() {

    println("Main program starts ; ${Thread.currentThread().name}")

//    background thread:
//    thread {
//        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(2000)
//        println("Fake work finished: ${Thread.currentThread().name}")
//    }

    println("Main program ends ; ${Thread.currentThread().name}")

/*    coroutines: won't work becoz there is no gradle file in our project:

    GlobalScope.launch{
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(2000)
        println("Fake work finished: ${Thread.currentThread().name}")
    }

   unlike threads, for coroutine application by default doesn't wait for it to
 finish.

   Now how can we make the main function to wait for the coroutine to get its work done?
   > well for this we need to manually make our application, wait for the coroutine
   to finish it job.
   So to do so, we have to use Thread.sleep(2000) in main.
   > but question may arise, what happen in real project. I mean if there
   is a task of uploading a file, then there we can't predict how much
   time does it take to upload. So there we can't use Thread.sleep().
   > so for this we have wait little , we will get our answer in next lecture.

  GlobalScope.launch{
        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(2000) we not use Thread.sleep() because it block the execution of other
//            coroutines present under this tread.
//  so instead we use: delay(2000) it will only block the particular coroutine for which it is use.
// and delay() function can only use in coroutine, It will throw error if u use it in thread.
    delay(2000)

// if you use it in main thread it show an error "You cannot call suspending function
// from outside a coroutine.
// delay() function is a type of suspend modifier.

// noe what is suspending function?:
    suspend is a new modifier in kotlin.
    > A function with 'suspend' modifier is basically known as suspending function.
    > The suspending functions are only allowed to be called from a coroutine or
    from another suspending function.
    > They cannot be called from outside the coroutine.

    so to run the delay() function in main thread, we need to use
    runBlocking{} lambda expression. like this:

    in main: may be not work because of absence of gradle file.
    runBlocking{ // creates a coroutine that block the current main thread.But not run in background.
    delay(2000)
    }
//    Although this is also not exactly the right way to wait for other coroutine to
finish the task. The right way ,we will see later.


so above all code can also be written like this:

    runBlocking{
    println("Main program starts ; ${Thread.currentThread().name}")
    GlobalScope.launch{
        println("Fake work starts: ${Thread.currentThread().name}")
        mySuspendingFunction(2000)(2000)
        println("Fake work finished: ${Thread.currentThread().name}")
    }
    mySuspendingFunction(2000)(2000)
     println("Fake work finished: ${Thread.currentThread().name}")
     }

     or can also be written as:

     fun main =   runBlocking{
    println("Main program starts ; ${Thread.currentThread().name}")
    GlobalScope.launch{
        println("Fake work starts: ${Thread.currentThread().name}")
        mySuspendingFunction(2000)
        println("Fake work finished: ${Thread.currentThread().name}")
    }
    mySuspendingFunction(2000)(2000)
     println("Fake work finished: ${Thread.currentThread().name}")
     }

     both ways will provide same output.


 */
    }

// create our own suspending function:

suspend fun mySuspendingFunction(time:Long){
//    delay(time) may not work because of absence of gradle file.
}
