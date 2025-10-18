# Java Logic Practice Exercises 🧠💻

This repository contains a small collection of beginner-friendly Java exercises designed to improve logic, problem-solving, and familiarity with core Java features like loops, collections, and console input.

## 📂 Exercises Included

### 1. 🧺 Inventory Value Sorter

Calculates the total value of products in an inventory based on quantity and unit price.  
Sorts the products from most valuable to least.

**Example:**

```java
Map<String, double[]> inventory = new HashMap<>();
inventory.put("apples", new double[]{50, 0.5});
inventory.put("oranges", new double[]{30, 0.8});
Output:

css
Copiar código
[("apples", 25.0), ("oranges", 24.0)]
```
### 2. ⏰ Campanadas
Reads a start and end time (HH:mm) from the console and calculates how many times a bell rings in that interval.
Bells ring at minutes 0, 15, 30, and 45 of each hour.

Example input:


```
Start = 9:44  
End = 10:01
```
Output:
```
2 campanadas
```
### 3. 📚 Vocabulary Comparison with Sets
Given two text strings, this program:

Finds unique words in each text

Finds words in common

Returns all words sorted alphabetically (without duplicates)

Uses Set<String> and sorted() for clean set operations and output.

🚀 How to Run
Clone the repo:
```
git clone https://github.com/yourusername/java-logic-exercises.git
```
Open the project in IntelliJ (or any Java IDE)

Run the desired exercise .java file from the main method



Feel free to contribute or add new logic challenges! 
