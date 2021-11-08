FROM openjdk:16-alpine
COPY target/Expense-Tracker-API-0.0.1-SNAPSHOT.jar /expenseTracker.jar
CMD ["java","-jar", "/expenseTracker.jar"]

