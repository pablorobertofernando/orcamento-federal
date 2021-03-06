package OntologiaOrcamentoFederal;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: IdentificadorUSO <br>
 * @version generated on Tue Apr 18 15:42:56 BOT 2017 by kennedy
 */

public interface IdentificadorUSO extends Classificador {

    /* ***************************************************
     * Property https://github.com/kennedyrs/orcamento-federal#codigo
     */
     
    /**
     * Gets all property values for the codigo property.<p>
     * 
     * @returns a collection of values for the codigo property.
     */
    Collection<? extends String> getCodigo();

    /**
     * Checks if the class has a codigo property value.<p>
     * 
     * @return true if there is a codigo property value.
     */
    boolean hasCodigo();

    /**
     * Adds a codigo property value.<p>
     * 
     * @param newCodigo the codigo property value to be added
     */
    void addCodigo(String newCodigo);

    /**
     * Removes a codigo property value.<p>
     * 
     * @param oldCodigo the codigo property value to be removed.
     */
    void removeCodigo(String oldCodigo);



    /* ***************************************************
     * Property https://github.com/kennedyrs/orcamento-federal#label
     */
     
    /**
     * Gets all property values for the label property.<p>
     * 
     * @returns a collection of values for the label property.
     */
    Collection<? extends String> getLabel();

    /**
     * Checks if the class has a label property value.<p>
     * 
     * @return true if there is a label property value.
     */
    boolean hasLabel();

    /**
     * Adds a label property value.<p>
     * 
     * @param newLabel the label property value to be added
     */
    void addLabel(String newLabel);

    /**
     * Removes a label property value.<p>
     * 
     * @param oldLabel the label property value to be removed.
     */
    void removeLabel(String oldLabel);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
