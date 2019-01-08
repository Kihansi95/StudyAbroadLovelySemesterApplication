package fr.insa.soa.model.exception;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(Long id) {
        super("Student not found "+id);
    }
}
