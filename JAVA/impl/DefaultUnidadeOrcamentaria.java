package OntologiaOrcamentoFederal.impl;

import OntologiaOrcamentoFederal.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultUnidadeOrcamentaria <br>
 * @version generated on Tue Apr 18 15:42:57 BOT 2017 by kennedy
 */
public class DefaultUnidadeOrcamentaria extends WrappedIndividualImpl implements UnidadeOrcamentaria {

    public DefaultUnidadeOrcamentaria(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temOrgao
     */
     
    public Collection<? extends Orgao> getTemOrgao() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMORGAO,
                                               DefaultOrgao.class);
    }

    public boolean hasTemOrgao() {
	   return !getTemOrgao().isEmpty();
    }

    public void addTemOrgao(Orgao newTemOrgao) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMORGAO,
                                       newTemOrgao);
    }

    public void removeTemOrgao(Orgao oldTemOrgao) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMORGAO,
                                          oldTemOrgao);
    }


    /* ***************************************************
     * Data Property https://github.com/kennedyrs/orcamento-federal#codigo
     */
     
    public Collection<? extends String> getCodigo() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CODIGO, String.class);
    }

    public boolean hasCodigo() {
		return !getCodigo().isEmpty();
    }

    public void addCodigo(String newCodigo) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CODIGO, newCodigo);
    }

    public void removeCodigo(String oldCodigo) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CODIGO, oldCodigo);
    }


    /* ***************************************************
     * Data Property https://github.com/kennedyrs/orcamento-federal#label
     */
     
    public Collection<? extends String> getLabel() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LABEL, String.class);
    }

    public boolean hasLabel() {
		return !getLabel().isEmpty();
    }

    public void addLabel(String newLabel) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LABEL, newLabel);
    }

    public void removeLabel(String oldLabel) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LABEL, oldLabel);
    }


}
