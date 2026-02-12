
☕ Java Multithreading Practice Repository

This repository contains various Java multithreading examples implemented for learning, hands-on practice, and interview preparation.

It covers core thread concepts, synchronization, Executor Framework, and common concurrency problems.

📚 Topics Covered

1.Thread class

2.Runnable interface

3.start() vs run()

4.Thread lifecycle

5.join() method

6.yield() method

7.synchronized keyword

8.synchronized block

9.ThreadLocal

10.ExecutorService

11.FixedThreadPool

12.CachedThreadPool

13.ScheduledExecutorService

14.Callable & Future

15.Producer-Consumer problem

📂 Project Structure
🔹 Basic Thread Examples
1️⃣ PrintMessage.java

Demonstrates thread creation using the Thread class and basic synchronization.

2️⃣ PrintTopperNamee.java

Example of thread execution with synchronized behavior.

3️⃣ SynchronizedBlock.java

Shows how synchronized blocks prevent race conditions.

4️⃣ JoinMethod.java

Demonstrates how join() makes the main thread wait for child threads to finish execution.

5️⃣ YieldMethod.java

Demonstrates the use of Thread.yield() method.
yield() gives a hint to the thread scheduler that the current thread is willing to pause and allow other threads of the same priority to execute.

⚠ Note: yield() does not guarantee execution of another thread. It depends on the JVM and OS scheduler.

6️⃣ ThreadlocalEx.java

Example of ThreadLocal to maintain thread-specific data.

🔹 Executor Framework Examples
7️⃣ Executor_FixedThreadPool.java

Demonstrates how to create and use a FixedThreadPool.

8️⃣ Executor_CacheThreadPool.java

Example of CachedThreadPool usage.

9️⃣ Executor_ScheduleThreadPool.java

Demonstrates ScheduledExecutorService for delayed and periodic tasks.

🔟 CallableExampleSingleThreadExecutor.java

Shows how to use Callable with SingleThreadExecutor and retrieve results using Future.

🔹 Producer-Consumer Example
1️⃣1️⃣ PostboxExample.java

Implementation of the Producer-Consumer problem using multithreading concepts.

🧠 Key Concepts Explained

✔ How threads are created and started
✔ How execution order is controlled using join()
✔ How yield() behaves in thread scheduling
✔ How synchronization prevents race conditions
✔ Difference between Thread and Runnable
✔ How ExecutorService manages thread pools
✔ How Callable returns results (unlike Runnable)
✔ How thread-local variables work
✔ Practical understanding of concurrency problems

▶️ How to Run the Programs
Step 1: Compile
javac FileName.java

Step 2: Run
java FileName

Example:
javac JoinMethod.java
java JoinMethod

🎯 Purpose of This Repository

This repository is created for:

Practicing Java Multithreading

Strengthening core Java concepts

Preparing for technical interviews

Understanding real-world concurrency problems

🚀 Future Enhancements

ReentrantLock example

Deadlock example

Volatile keyword example

CountDownLatch example

CompletableFuture examples

Parallel Stream examples

👩‍💻 Author

Prerna Katole
