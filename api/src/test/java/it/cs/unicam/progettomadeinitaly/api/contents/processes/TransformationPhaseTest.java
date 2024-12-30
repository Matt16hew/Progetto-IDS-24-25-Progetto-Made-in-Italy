package it.cs.unicam.progettomadeinitaly.api.contents.processes;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TransformationPhaseTest {

    @Test
    void testTransformationPhaseCreationSuccess() {
        TransformationPhase phase = new TransformationPhase("Phase 1", "Initial phase", "ISO 9001");

        assertNotNull(phase);
        assertEquals("Phase 1", phase.getName());
        assertEquals("Initial phase", phase.getDescription());
        assertEquals("ISO 9001", phase.getCertification());
        assertTrue(phase.getProducers().isEmpty());
    }

    @Test
    void testTransformationPhaseCreationWithNullName() {
        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                new TransformationPhase(null, "Description", "Certification"));
        assertEquals("A transformation phase must have a name", exception.getMessage());
    }

    @Test
    void testTransformationPhaseCreationWithNullDescription() {
        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                new TransformationPhase("Name", null, "Certification"));
        assertEquals("A transformation phase must have a description", exception.getMessage());
    }

    @Test
    void testTransformationPhaseCreationWithNullCertification() {
        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                new TransformationPhase("Name", "Description", null));
        assertEquals("A transformation phase must have a certification", exception.getMessage());
    }

    @Test
    void testAddSingleProducer() {
        TransformationPhase phase = new TransformationPhase("Phase 1", "Initial phase", "ISO 9001");
        String expected = "Test_Producer";

        boolean result = phase.addProducer(expected);

        assertTrue(result);
        assertEquals(1, phase.getProducers().size());
        assertEquals(expected, phase.getProducers().getFirst());
    }

    @Test
    void testAddNullProducer() {
        TransformationPhase phase = new TransformationPhase("Phase 1", "Initial phase", "ISO 9001");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                phase.addProducer(null));
        assertEquals("Cannot add null producers", exception.getMessage());
    }

    @Test
    void testAddMultipleProducers() {
        TransformationPhase phase = new TransformationPhase("Phase 1", "Initial phase", "ISO 9001");
        List<String> producers = new ArrayList<>();
        producers.add("Test_Producer_1");
        producers.add("Test_Producer_2");

        boolean result = phase.addProducers(producers);

        assertTrue(result);
        assertEquals(2, phase.getProducers().size());
        assertEquals("Producer 1", phase.getProducers().get(0));
        assertEquals("Producer 2", phase.getProducers().get(1));
    }

    @Test
    void testAddNullProducersList() {
        TransformationPhase phase = new TransformationPhase("Phase 1", "Initial phase", "ISO 9001");

        NullPointerException exception = assertThrows(NullPointerException.class, () ->
                phase.addProducers(null));
        assertEquals("Cannot add null producers", exception.getMessage());
    }

    @Test
    void testAddEmptyProducersList() {
        TransformationPhase phase = new TransformationPhase("Phase 1", "Initial phase", "ISO 9001");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                phase.addProducers(new ArrayList<>()));
        assertEquals("Cannot add an empty list to producers", exception.getMessage());
    }

}