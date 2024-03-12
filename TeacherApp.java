import java.io.*;

class Teacher {
    private String firstName;
    private String lastName;
    private int empId;
    private String deptName;

    public Teacher(String firstName, String lastName, int empId, String deptName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.deptName = deptName;
    }

    public void writeToTextFile(String fileName) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(this.firstName + "," + this.lastName + "," + this.empId + "," + this.deptName);
        } catch (IOException e) {
            throw new IOException("Failed to write to file: " + fileName, e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    // ignore error while closing writer
                }
            }
        }
    }

    public static Teacher readFromTextFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            if (line == null) {
                throw new IOException("File is empty: " + fileName);
            }
            String[] parts = line.split(",");
            if (parts.length != 4) {
                throw new IOException("Invalid format in file: " + fileName);
            }
            return new Teacher(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
        } catch (NumberFormatException e) {
            throw new IOException("Invalid number format in file: " + fileName, e);
        } catch (IOException e) {
            throw new IOException("Failed to read from file: " + fileName, e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // ignore error while closing reader
                }
            }
        }
    }

   // @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}

class TeacherApp {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", "Doe", 12345, "Mathematics");
        try {
            teacher.writeToTextFile("teacher.txt");
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("Failed to write to file: " + e.getMessage());
        }

        try {
            Teacher readTeacher = Teacher.readFromTextFile("teacher.txt");
            System.out.println("Successfully read from file: " + readTeacher);
        } catch (IOException e) {
            System.out.println("Failed to read from file: " + e.getMessage());
        }
    }
}
