/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.analysis;

import cida.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTPonto(TPonto node);
    void caseTCode(TCode node);
    void caseTVirgula(TVirgula node);
    void caseTAspaSimples(TAspaSimples node);
    void caseTAspasDuplas(TAspasDuplas node);
    void caseTInicioComentarioLinha(TInicioComentarioLinha node);
    void caseTAbreComentarioBloco(TAbreComentarioBloco node);
    void caseTFechaComentarioBloco(TFechaComentarioBloco node);
    void caseTParenteseE(TParenteseE node);
    void caseTParenteseD(TParenteseD node);
    void caseTColcheteE(TColcheteE node);
    void caseTColcheteD(TColcheteD node);
    void caseTMenos(TMenos node);
    void caseTMais(TMais node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTDivisao(TDivisao node);
    void caseTModulo(TModulo node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTIgualdade(TIgualdade node);
    void caseTDiferente(TDiferente node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMenor(TMenor node);
    void caseTMaior(TMaior node);
    void caseTNegacao(TNegacao node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTXor(TXor node);
    void caseTAs(TAs node);
    void caseTLong(TLong node);
    void caseTIn(TIn node);
    void caseTCase(TCase node);
    void caseTThat(TThat node);
    void caseTConsidering(TConsidering node);
    void caseTFrom(TFrom node);
    void caseTTo(TTo node);
    void caseTBy(TBy node);
    void caseTDo(TDo node);
    void caseTUnalterable(TUnalterable node);
    void caseTAlterable(TAlterable node);
    void caseTVector(TVector node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTCapture(TCapture node);
    void caseTShow(TShow node);
    void caseTYes(TYes node);
    void caseTNo(TNo node);
    void caseTNumber(TNumber node);
    void caseTId(TId node);
    void caseTVazio(TVazio node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
