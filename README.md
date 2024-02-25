# spring-cyclicbarrier
A simple project to kickstart your spring boot and cyclic barrier journey

Note: In testing
1. Run the application by using any idea of your choice (example VSCode)
2. By using postman or any other testing application you can check the validity of the application. Paste the following info accordingly
   Endpoint :
     GET http://localhost:8080/service
4. Sample Response
   - Success
   - Check console log for
     - This is thread1
     - This is thread2
     - This is thread3
     - Thread 3 continued
     - Thread 1 continued
     - Thread 2 continued
   - Note : Once the thread continues the order of execution depends on the handling of executor service
