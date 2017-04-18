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
 * Source Class: DefaultItemDespesa <br>
 * @version generated on Tue Apr 18 15:42:56 BOT 2017 by kennedy
 */
public class DefaultItemDespesa extends WrappedIndividualImpl implements ItemDespesa {

    public DefaultItemDespesa(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temAcao
     */
     
    public Collection<? extends Acao> getTemAcao() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMACAO,
                                               DefaultAcao.class);
    }

    public boolean hasTemAcao() {
	   return !getTemAcao().isEmpty();
    }

    public void addTemAcao(Acao newTemAcao) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMACAO,
                                       newTemAcao);
    }

    public void removeTemAcao(Acao oldTemAcao) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMACAO,
                                          oldTemAcao);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temCategoriaEconomica
     */
     
    public Collection<? extends CategoriaEconomica> getTemCategoriaEconomica() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMCATEGORIAECONOMICA,
                                               DefaultCategoriaEconomica.class);
    }

    public boolean hasTemCategoriaEconomica() {
	   return !getTemCategoriaEconomica().isEmpty();
    }

    public void addTemCategoriaEconomica(CategoriaEconomica newTemCategoriaEconomica) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMCATEGORIAECONOMICA,
                                       newTemCategoriaEconomica);
    }

    public void removeTemCategoriaEconomica(CategoriaEconomica oldTemCategoriaEconomica) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMCATEGORIAECONOMICA,
                                          oldTemCategoriaEconomica);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temClassificador
     */
     
    public Collection<? extends Classificador> getTemClassificador() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMCLASSIFICADOR,
                                               DefaultClassificador.class);
    }

    public boolean hasTemClassificador() {
	   return !getTemClassificador().isEmpty();
    }

    public void addTemClassificador(Classificador newTemClassificador) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMCLASSIFICADOR,
                                       newTemClassificador);
    }

    public void removeTemClassificador(Classificador oldTemClassificador) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMCLASSIFICADOR,
                                          oldTemClassificador);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temElementoDespesa
     */
     
    public Collection<? extends ElementoDespesa> getTemElementoDespesa() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMELEMENTODESPESA,
                                               DefaultElementoDespesa.class);
    }

    public boolean hasTemElementoDespesa() {
	   return !getTemElementoDespesa().isEmpty();
    }

    public void addTemElementoDespesa(ElementoDespesa newTemElementoDespesa) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMELEMENTODESPESA,
                                       newTemElementoDespesa);
    }

    public void removeTemElementoDespesa(ElementoDespesa oldTemElementoDespesa) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMELEMENTODESPESA,
                                          oldTemElementoDespesa);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temEsfera
     */
     
    public Collection<? extends Esfera> getTemEsfera() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMESFERA,
                                               DefaultEsfera.class);
    }

    public boolean hasTemEsfera() {
	   return !getTemEsfera().isEmpty();
    }

    public void addTemEsfera(Esfera newTemEsfera) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMESFERA,
                                       newTemEsfera);
    }

    public void removeTemEsfera(Esfera oldTemEsfera) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMESFERA,
                                          oldTemEsfera);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temExercicio
     */
     
    public Collection<? extends Exercicio> getTemExercicio() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMEXERCICIO,
                                               DefaultExercicio.class);
    }

    public boolean hasTemExercicio() {
	   return !getTemExercicio().isEmpty();
    }

    public void addTemExercicio(Exercicio newTemExercicio) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMEXERCICIO,
                                       newTemExercicio);
    }

    public void removeTemExercicio(Exercicio oldTemExercicio) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMEXERCICIO,
                                          oldTemExercicio);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temFonteRecursos
     */
     
    public Collection<? extends FonteRecursos> getTemFonteRecursos() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMFONTERECURSOS,
                                               DefaultFonteRecursos.class);
    }

    public boolean hasTemFonteRecursos() {
	   return !getTemFonteRecursos().isEmpty();
    }

    public void addTemFonteRecursos(FonteRecursos newTemFonteRecursos) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMFONTERECURSOS,
                                       newTemFonteRecursos);
    }

    public void removeTemFonteRecursos(FonteRecursos oldTemFonteRecursos) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMFONTERECURSOS,
                                          oldTemFonteRecursos);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temFuncao
     */
     
    public Collection<? extends Funcao> getTemFuncao() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMFUNCAO,
                                               DefaultFuncao.class);
    }

    public boolean hasTemFuncao() {
	   return !getTemFuncao().isEmpty();
    }

    public void addTemFuncao(Funcao newTemFuncao) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMFUNCAO,
                                       newTemFuncao);
    }

    public void removeTemFuncao(Funcao oldTemFuncao) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMFUNCAO,
                                          oldTemFuncao);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temGnd
     */
     
    public Collection<? extends GrupoNatDespesa> getTemGnd() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMGND,
                                               DefaultGrupoNatDespesa.class);
    }

    public boolean hasTemGnd() {
	   return !getTemGnd().isEmpty();
    }

    public void addTemGnd(GrupoNatDespesa newTemGnd) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMGND,
                                       newTemGnd);
    }

    public void removeTemGnd(GrupoNatDespesa oldTemGnd) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMGND,
                                          oldTemGnd);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temIdentificadorUSO
     */
     
    public Collection<? extends IdentificadorUSO> getTemIdentificadorUSO() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMIDENTIFICADORUSO,
                                               DefaultIdentificadorUSO.class);
    }

    public boolean hasTemIdentificadorUSO() {
	   return !getTemIdentificadorUSO().isEmpty();
    }

    public void addTemIdentificadorUSO(IdentificadorUSO newTemIdentificadorUSO) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMIDENTIFICADORUSO,
                                       newTemIdentificadorUSO);
    }

    public void removeTemIdentificadorUSO(IdentificadorUSO oldTemIdentificadorUSO) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMIDENTIFICADORUSO,
                                          oldTemIdentificadorUSO);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temModalidadeAplicacao
     */
     
    public Collection<? extends ModalidadeAplicacao> getTemModalidadeAplicacao() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMMODALIDADEAPLICACAO,
                                               DefaultModalidadeAplicacao.class);
    }

    public boolean hasTemModalidadeAplicacao() {
	   return !getTemModalidadeAplicacao().isEmpty();
    }

    public void addTemModalidadeAplicacao(ModalidadeAplicacao newTemModalidadeAplicacao) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMMODALIDADEAPLICACAO,
                                       newTemModalidadeAplicacao);
    }

    public void removeTemModalidadeAplicacao(ModalidadeAplicacao oldTemModalidadeAplicacao) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMMODALIDADEAPLICACAO,
                                          oldTemModalidadeAplicacao);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temPlanoOrcamentario
     */
     
    public Collection<? extends PlanoOrcamentario> getTemPlanoOrcamentario() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMPLANOORCAMENTARIO,
                                               DefaultPlanoOrcamentario.class);
    }

    public boolean hasTemPlanoOrcamentario() {
	   return !getTemPlanoOrcamentario().isEmpty();
    }

    public void addTemPlanoOrcamentario(PlanoOrcamentario newTemPlanoOrcamentario) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMPLANOORCAMENTARIO,
                                       newTemPlanoOrcamentario);
    }

    public void removeTemPlanoOrcamentario(PlanoOrcamentario oldTemPlanoOrcamentario) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMPLANOORCAMENTARIO,
                                          oldTemPlanoOrcamentario);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temPrograma
     */
     
    public Collection<? extends Programa> getTemPrograma() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMPROGRAMA,
                                               DefaultPrograma.class);
    }

    public boolean hasTemPrograma() {
	   return !getTemPrograma().isEmpty();
    }

    public void addTemPrograma(Programa newTemPrograma) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMPROGRAMA,
                                       newTemPrograma);
    }

    public void removeTemPrograma(Programa oldTemPrograma) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMPROGRAMA,
                                          oldTemPrograma);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temResultadoPrimario
     */
     
    public Collection<? extends ResultadoPrimario> getTemResultadoPrimario() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMRESULTADOPRIMARIO,
                                               DefaultResultadoPrimario.class);
    }

    public boolean hasTemResultadoPrimario() {
	   return !getTemResultadoPrimario().isEmpty();
    }

    public void addTemResultadoPrimario(ResultadoPrimario newTemResultadoPrimario) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMRESULTADOPRIMARIO,
                                       newTemResultadoPrimario);
    }

    public void removeTemResultadoPrimario(ResultadoPrimario oldTemResultadoPrimario) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMRESULTADOPRIMARIO,
                                          oldTemResultadoPrimario);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temSubFuncao
     */
     
    public Collection<? extends Subfuncao> getTemSubFuncao() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMSUBFUNCAO,
                                               DefaultSubfuncao.class);
    }

    public boolean hasTemSubFuncao() {
	   return !getTemSubFuncao().isEmpty();
    }

    public void addTemSubFuncao(Subfuncao newTemSubFuncao) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMSUBFUNCAO,
                                       newTemSubFuncao);
    }

    public void removeTemSubFuncao(Subfuncao oldTemSubFuncao) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMSUBFUNCAO,
                                          oldTemSubFuncao);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temSubtitulo
     */
     
    public Collection<? extends Subtitulo> getTemSubtitulo() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMSUBTITULO,
                                               DefaultSubtitulo.class);
    }

    public boolean hasTemSubtitulo() {
	   return !getTemSubtitulo().isEmpty();
    }

    public void addTemSubtitulo(Subtitulo newTemSubtitulo) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMSUBTITULO,
                                       newTemSubtitulo);
    }

    public void removeTemSubtitulo(Subtitulo oldTemSubtitulo) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMSUBTITULO,
                                          oldTemSubtitulo);
    }


    /* ***************************************************
     * Object Property https://github.com/kennedyrs/orcamento-federal#temUnidadeOrcamentaria
     */
     
    public Collection<? extends UnidadeOrcamentaria> getTemUnidadeOrcamentaria() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TEMUNIDADEORCAMENTARIA,
                                               DefaultUnidadeOrcamentaria.class);
    }

    public boolean hasTemUnidadeOrcamentaria() {
	   return !getTemUnidadeOrcamentaria().isEmpty();
    }

    public void addTemUnidadeOrcamentaria(UnidadeOrcamentaria newTemUnidadeOrcamentaria) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TEMUNIDADEORCAMENTARIA,
                                       newTemUnidadeOrcamentaria);
    }

    public void removeTemUnidadeOrcamentaria(UnidadeOrcamentaria oldTemUnidadeOrcamentaria) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TEMUNIDADEORCAMENTARIA,
                                          oldTemUnidadeOrcamentaria);
    }


    /* ***************************************************
     * Data Property https://github.com/kennedyrs/orcamento-federal#valorDotacaoInicial
     */
     
    public Collection<? extends Object> getValorDotacaoInicial() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORDOTACAOINICIAL, Object.class);
    }

    public boolean hasValorDotacaoInicial() {
		return !getValorDotacaoInicial().isEmpty();
    }

    public void addValorDotacaoInicial(Object newValorDotacaoInicial) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORDOTACAOINICIAL, newValorDotacaoInicial);
    }

    public void removeValorDotacaoInicial(Object oldValorDotacaoInicial) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORDOTACAOINICIAL, oldValorDotacaoInicial);
    }


    /* ***************************************************
     * Data Property https://github.com/kennedyrs/orcamento-federal#valorEmpenhado
     */
     
    public Collection<? extends Object> getValorEmpenhado() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALOREMPENHADO, Object.class);
    }

    public boolean hasValorEmpenhado() {
		return !getValorEmpenhado().isEmpty();
    }

    public void addValorEmpenhado(Object newValorEmpenhado) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALOREMPENHADO, newValorEmpenhado);
    }

    public void removeValorEmpenhado(Object oldValorEmpenhado) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALOREMPENHADO, oldValorEmpenhado);
    }


    /* ***************************************************
     * Data Property https://github.com/kennedyrs/orcamento-federal#valorLeiMaisCreditos
     */
     
    public Collection<? extends Object> getValorLeiMaisCreditos() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORLEIMAISCREDITOS, Object.class);
    }

    public boolean hasValorLeiMaisCreditos() {
		return !getValorLeiMaisCreditos().isEmpty();
    }

    public void addValorLeiMaisCreditos(Object newValorLeiMaisCreditos) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORLEIMAISCREDITOS, newValorLeiMaisCreditos);
    }

    public void removeValorLeiMaisCreditos(Object oldValorLeiMaisCreditos) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORLEIMAISCREDITOS, oldValorLeiMaisCreditos);
    }


    /* ***************************************************
     * Data Property https://github.com/kennedyrs/orcamento-federal#valorLiquidado
     */
     
    public Collection<? extends Object> getValorLiquidado() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORLIQUIDADO, Object.class);
    }

    public boolean hasValorLiquidado() {
		return !getValorLiquidado().isEmpty();
    }

    public void addValorLiquidado(Object newValorLiquidado) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORLIQUIDADO, newValorLiquidado);
    }

    public void removeValorLiquidado(Object oldValorLiquidado) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORLIQUIDADO, oldValorLiquidado);
    }


    /* ***************************************************
     * Data Property https://github.com/kennedyrs/orcamento-federal#valorPago
     */
     
    public Collection<? extends Object> getValorPago() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORPAGO, Object.class);
    }

    public boolean hasValorPago() {
		return !getValorPago().isEmpty();
    }

    public void addValorPago(Object newValorPago) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORPAGO, newValorPago);
    }

    public void removeValorPago(Object oldValorPago) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORPAGO, oldValorPago);
    }


    /* ***************************************************
     * Data Property https://github.com/kennedyrs/orcamento-federal#valorProjetoLei
     */
     
    public Collection<? extends Object> getValorProjetoLei() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORPROJETOLEI, Object.class);
    }

    public boolean hasValorProjetoLei() {
		return !getValorProjetoLei().isEmpty();
    }

    public void addValorProjetoLei(Object newValorProjetoLei) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORPROJETOLEI, newValorProjetoLei);
    }

    public void removeValorProjetoLei(Object oldValorProjetoLei) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALORPROJETOLEI, oldValorProjetoLei);
    }


}
