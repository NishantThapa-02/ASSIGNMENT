import java.util.*;
public class Demo{
    
    /**
     * Prints a title and every student in the collection.
     *
     * @param title the heading to print
     * @param c the students to print
     */
    static void display(String title, Collection<Student> c) {
        System.out.println("--- " + title + " ---");
        for (Student s : c) {
            System.out.println("  " + s);
        }
    }
    
    /**
     * Runs the demo.
     *
     * @param args not used
     */
    public static void main(String[] args){
        System.out.println("========== STUDENT COLLECTION MANAGEMENT SYSTEM ==========\n");
        // 1. Original List
        System.out.println("1. Original Student List");
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "James", "CS", 3.5));
        students.add(new Student(3, "Milly", "Math", 2.0));
        students.add(new Student(5, "Miles", "Physics", 2.4));
        students.add(new Student(2, "Peter", "CS", 3.9));
        students.add(new Student(7, "Harry", "Engineering", 3.6));
        students.add(new Student(9, "Jenna", "CS", 2.2));
        display("Original List", students);
         
        // 2. ArrayList operations
        System.out.println("2. ArrayList Operations");
        System.out.println("size(): " + students.size());
        System.out.println("isEmpty(): " + students.isEmpty());
        System.out.println("get(0): " + students.get(0));
        students.set(1, new Student(10, "Ethan", "Statistics", 3.0));
        System.out.println("set(1, ...): " + students.get(1));
        students.add(new Student(19, "Nina", "Chemistry", 3.6));
        System.out.println("add(Nina): size is now " + students.size());
        students.remove(4);
        System.out.println("remove(4): size is now " + students.size());
        System.out.println("contains(ID 5): " + students.contains(new Student(5, "x", "x", 0)));
        
        // 3. for-each traversal
        System.out.println("3. For-Each Traversal");
        for (Student s : students){ 
            System.out.println(" " + s.getName());
        }
        
        // 4. Iterator Traversal
        System.out.println("4. Iterator Traversal");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            System.out.println(" " + it.next().getName());
        }
        
        // 5. Lambda / forEach traversal
        System.out.println("5. Lambda / forEach Traversal");
        students.forEach(s -> System.out.println(" " + s.getName()));
        
        // 6. sort by name
        System.out.println("6. Students Sorted by Name");
        Collections.sort(students);
        display("By name", students);
        
        // 7. sort by gpa
        System.out.println("7. Students Sorted by GPA");
        Comparator<Student> byGPA = (s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa());
        Collections.sort(students, byGPA);
        display("By GPA", students);
        
        // 8. sort by ID
        System.out.println("8. Students Sorted by ID");
        Comparator<Student> byID = (s1, s2) -> Integer.compare(s1.getId(), s2.getId());
        Collections.sort(students, byID);
        display("By ID", students);
        
        // 9. filter with iterator
        System.out.println("9. Filtering Students Using Iterator");
        display("Before", students);
        Iterator<Student> filter = students.iterator();
        while (filter.hasNext()) {
            if (filter.next().getGpa() < 2.5) {
                filter.remove();
            }
        }
        display("After removing GPA < 2.5", students);
        
        // 10. HasSet and DUplicates
        System.out.println("10. HasSet and Duplicate Student Test");
        Set<Student> studentSet = new HashSet<>(students);
        Student first = students.get(0);
        Student duplicate = new Student(first.getId(), "Copy", "Art", 1.0);
        System.out.println("first == duplicate: " + (first == duplicate));
        System.out.println("first.equals(duplicate): " + first.equals(duplicate));
        System.out.println("same hashCode: " + (first.hashCode() == duplicate.hashCode()));
        System.out.println("HashSet.add(duplicate): " + studentSet.add(duplicate)
                + " (size stays " + studentSet.size() + ")");
        List<Student> listWithDuplicate = new ArrayList<>(students);
        listWithDuplicate.add(duplicate);
        System.out.println("ArrayList with duplicate: size " + listWithDuplicate.size() + " (lists allow duplicates)");
        
        // 11. TreeSet and linkedList
        System.out.println("11. TreeSet and Sorted Students");
        Set<Student> treeSet = new TreeSet<>(students);
        treeSet.add(new Student(23, "Bella", "Art", 3.7));
        display("TreeSet (unique, sorted by name)", treeSet);
 
        List<Student> linkedList = new LinkedList<>(students);
        linkedList.add(0, new Student(17, "Ben", "History", 3.2));
        System.out.println("LinkedList after adding Ben at the front: " + linkedList.get(0).getName());
 
        System.out.println("\nArrayList:  ordered, duplicates allowed");
        System.out.println("LinkedList: ordered, duplicates allowed, quick add/remove at the ends");
        System.out.println("HashSet:    no duplicates, no guaranteed order");
        System.out.println("TreeSet:    no duplicates, always sorted");
        
        System.out.println("\n========== END OF PROGRAM ==========");
    }
}