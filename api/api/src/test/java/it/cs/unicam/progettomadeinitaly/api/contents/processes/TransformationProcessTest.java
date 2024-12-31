package it.cs.unicam.progettomadeinitaly.api.contents.processes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransformationProcessTest {

    private TransformationProcess transformationProcess;

    @BeforeEach
    void setUp() {
        transformationProcess = new TransformationProcess(1, "AuthorName");
    }

    @Test
    void testConstructorValidParameters() {
        assertDoesNotThrow(() -> new TransformationProcess(1, "AuthorName"));
        TransformationProcess tp = new TransformationProcess(2, "AnotherAuthor");
        assertEquals(2, tp.getId());
        assertEquals("AnotherAuthor", tp.getAuthor());
        assertFalse(tp.isPublished());
    }

    @Test
    void testConstructorNegativeIdThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new TransformationProcess(-1, "AuthorName"));
        assertEquals("id can not be negative", exception.getMessage());
    }

    @Test
    void testConstructorNullAuthorThrowsException() {
        Exception exception = assertThrows(NullPointerException.class,
                () -> new TransformationProcess(1, null));
        assertEquals("A transformation process must have an author", exception.getMessage());
    }

    @Test
    void testGetId() {
        assertEquals(1, transformationProcess.getId());
    }

    @Test
    void testGetAndSetName() {
        transformationProcess.setName("New Name");
        assertEquals("New Name", transformationProcess.getName());

        Exception exception = assertThrows(NullPointerException.class,
                () -> transformationProcess.setName(null));
        assertEquals("name can not be null", exception.getMessage());
    }

    @Test
    void testGetAndSetDescription() {
        transformationProcess.setDescription("New Description");
        assertEquals("New Description", transformationProcess.getDescription());

        Exception exception = assertThrows(NullPointerException.class,
                () -> transformationProcess.setDescription(null));
        assertEquals("description can not be null", exception.getMessage());
    }

    @Test
    void testIsPublished() {
        assertFalse(transformationProcess.isPublished());
        transformationProcess.publish();
        assertTrue(transformationProcess.isPublished());
    }

    @Test
    void testPublish() {
        transformationProcess.publish();
        assertTrue(transformationProcess.isPublished());
    }

    @Test
    void testGetAuthor() {
        assertEquals("AuthorName", transformationProcess.getAuthor());
    }

    @Test
    void testGetPhasesOfTransformation() {
        List<TransformationPhase> phases = transformationProcess.getPhasesOfTransformation();
        assertNotNull(phases);
        assertTrue(phases.isEmpty());

        // Verify immutability of the returned list
        Exception exception = assertThrows(UnsupportedOperationException.class,
                () -> phases.add(new TransformationPhase("Nan","Nan","Nan")));
        assertNotNull(exception);
    }

}