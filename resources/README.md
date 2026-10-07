# Flight Operations Simulation — Project Setup & Instructions

Welcome to the **Flight Operations Simulation** assignment! This project focuses on utilizing **`LinkedList`** for queue management, **`Stack`** for modification safety, and a generic **`CSVReaderWriter` / `CSVTemplate`** pattern for data persistence.

---

## 1. Project Overview & Background

In air traffic control and airport operations management, flight queues are continuously dynamically re-ordered. Schedules change, emergencies occur, flights are delayed or cancelled, and high-priority arrivals need to jump the queue. 

In this simulation, you will manage an active queue of airport operations (`flts`) represented as a Java `LinkedList`. You will manipulate this queue using two primary data structure concepts:
1. **Double-Ended Queue (Deque) / LinkedList Operations:** Adding elements directly to the front (`addFirst`) or back (`addLast`) of the queue.
2. **Stack (LIFO - Last In, First Out):** Using a stack to safely stage elements for removal or relocation without triggering a `ConcurrentModificationException` while traversing the list.

---

## 2. Getting Started

1. **Extract Project:** Unzip `FlightOpsStarter.zip` directly into your IDE working directory (e.g., `IdeaProjects`).
   > **Note:** Avoid nested folders (e.g., `FlightOpsStarter/FlightOpsStarter`). Ensure `src/` sits directly under the main project root.
2. **Run the Tutorial First:** Navigate to `edu.dccc.flightops.ReadEmployeeCSV` and run its `main()` method.
   * This executes a working example showing how `Employee.java` implements `CSVTemplate` to load `resources/employees.csv` using `CSVReaderWriter`.
   * Use `ReadEmployeeCSV.java` as your primary blueprint for completing **Task 1**.

---

## 3. Project Structure & Architecture

```text
FlightOpsStarter/
├── src/
│   └── edu/
│       └── dccc/
│           ├── flightops/
│           │   ├── Employee.java            # Reference POJO model
│           │   ├── Flight.java              # Domain model representing a flight
│           │   ├── FlightOps.java           # Main assignment file with simulation steps
│           │   └── ReadEmployeeCSV.java     # Reference tutorial runner
│           └── utils/
│               ├── CSVReaderWriter.java     # Generic CSV file IO handler
│               └── CSVTemplate.java         # Interface for object serialization/deserialization
└── resources/
    ├── employees.csv                        # Sample CSV dataset for reference tutorial
    └── Flights.csv                          # Primary flight operations dataset