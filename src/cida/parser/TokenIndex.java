/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.parser;

import cida.node.*;
import cida.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTNot(@SuppressWarnings("unused") TNot node)
    {
        this.index = 0;
    }

    @Override
    public void caseTPonto(@SuppressWarnings("unused") TPonto node)
    {
        this.index = 1;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 2;
    }

    @Override
    public void caseTCode(@SuppressWarnings("unused") TCode node)
    {
        this.index = 3;
    }

    @Override
    public void caseTTipoNumber(@SuppressWarnings("unused") TTipoNumber node)
    {
        this.index = 4;
    }

    @Override
    public void caseTTipoAnswer(@SuppressWarnings("unused") TTipoAnswer node)
    {
        this.index = 5;
    }

    @Override
    public void caseTTipoSymbol(@SuppressWarnings("unused") TTipoSymbol node)
    {
        this.index = 6;
    }

    @Override
    public void caseTParenteseE(@SuppressWarnings("unused") TParenteseE node)
    {
        this.index = 7;
    }

    @Override
    public void caseTParenteseD(@SuppressWarnings("unused") TParenteseD node)
    {
        this.index = 8;
    }

    @Override
    public void caseTColcheteE(@SuppressWarnings("unused") TColcheteE node)
    {
        this.index = 9;
    }

    @Override
    public void caseTColcheteD(@SuppressWarnings("unused") TColcheteD node)
    {
        this.index = 10;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 11;
    }

    @Override
    public void caseTMais(@SuppressWarnings("unused") TMais node)
    {
        this.index = 12;
    }

    @Override
    public void caseTMultiplicacao(@SuppressWarnings("unused") TMultiplicacao node)
    {
        this.index = 13;
    }

    @Override
    public void caseTDivisao(@SuppressWarnings("unused") TDivisao node)
    {
        this.index = 14;
    }

    @Override
    public void caseTModulo(@SuppressWarnings("unused") TModulo node)
    {
        this.index = 15;
    }

    @Override
    public void caseTAtribuicao(@SuppressWarnings("unused") TAtribuicao node)
    {
        this.index = 16;
    }

    @Override
    public void caseTIgualdade(@SuppressWarnings("unused") TIgualdade node)
    {
        this.index = 17;
    }

    @Override
    public void caseTDiferente(@SuppressWarnings("unused") TDiferente node)
    {
        this.index = 18;
    }

    @Override
    public void caseTMenorIgual(@SuppressWarnings("unused") TMenorIgual node)
    {
        this.index = 19;
    }

    @Override
    public void caseTMaiorIgual(@SuppressWarnings("unused") TMaiorIgual node)
    {
        this.index = 20;
    }

    @Override
    public void caseTMenor(@SuppressWarnings("unused") TMenor node)
    {
        this.index = 21;
    }

    @Override
    public void caseTMaior(@SuppressWarnings("unused") TMaior node)
    {
        this.index = 22;
    }

    @Override
    public void caseTNegacao(@SuppressWarnings("unused") TNegacao node)
    {
        this.index = 23;
    }

    @Override
    public void caseTAnd(@SuppressWarnings("unused") TAnd node)
    {
        this.index = 24;
    }

    @Override
    public void caseTOr(@SuppressWarnings("unused") TOr node)
    {
        this.index = 25;
    }

    @Override
    public void caseTXor(@SuppressWarnings("unused") TXor node)
    {
        this.index = 26;
    }

    @Override
    public void caseTAs(@SuppressWarnings("unused") TAs node)
    {
        this.index = 27;
    }

    @Override
    public void caseTLong(@SuppressWarnings("unused") TLong node)
    {
        this.index = 28;
    }

    @Override
    public void caseTIn(@SuppressWarnings("unused") TIn node)
    {
        this.index = 29;
    }

    @Override
    public void caseTCase(@SuppressWarnings("unused") TCase node)
    {
        this.index = 30;
    }

    @Override
    public void caseTThat(@SuppressWarnings("unused") TThat node)
    {
        this.index = 31;
    }

    @Override
    public void caseTOtherwise(@SuppressWarnings("unused") TOtherwise node)
    {
        this.index = 32;
    }

    @Override
    public void caseTConsidering(@SuppressWarnings("unused") TConsidering node)
    {
        this.index = 33;
    }

    @Override
    public void caseTFrom(@SuppressWarnings("unused") TFrom node)
    {
        this.index = 34;
    }

    @Override
    public void caseTTo(@SuppressWarnings("unused") TTo node)
    {
        this.index = 35;
    }

    @Override
    public void caseTBy(@SuppressWarnings("unused") TBy node)
    {
        this.index = 36;
    }

    @Override
    public void caseTDo(@SuppressWarnings("unused") TDo node)
    {
        this.index = 37;
    }

    @Override
    public void caseTUnalterable(@SuppressWarnings("unused") TUnalterable node)
    {
        this.index = 38;
    }

    @Override
    public void caseTAlterable(@SuppressWarnings("unused") TAlterable node)
    {
        this.index = 39;
    }

    @Override
    public void caseTVector(@SuppressWarnings("unused") TVector node)
    {
        this.index = 40;
    }

    @Override
    public void caseTStart(@SuppressWarnings("unused") TStart node)
    {
        this.index = 41;
    }

    @Override
    public void caseTFinish(@SuppressWarnings("unused") TFinish node)
    {
        this.index = 42;
    }

    @Override
    public void caseTCapture(@SuppressWarnings("unused") TCapture node)
    {
        this.index = 43;
    }

    @Override
    public void caseTShow(@SuppressWarnings("unused") TShow node)
    {
        this.index = 44;
    }

    @Override
    public void caseTYes(@SuppressWarnings("unused") TYes node)
    {
        this.index = 45;
    }

    @Override
    public void caseTNo(@SuppressWarnings("unused") TNo node)
    {
        this.index = 46;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 47;
    }

    @Override
    public void caseTSymbol(@SuppressWarnings("unused") TSymbol node)
    {
        this.index = 48;
    }

    @Override
    public void caseTSymbolVector(@SuppressWarnings("unused") TSymbolVector node)
    {
        this.index = 49;
    }

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 50;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 51;
    }
}
