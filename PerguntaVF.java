package br.ufpb.dcx.ayla.quiz;

public class PerguntaVF extends Pergunta {

    private String afirmativa [];
    @Override
    public boolean estahCorretaResposta(String resposta) {
        boolean estaCorreta = false;
       if(getRespostaCorreta() == resposta) {
           return estaCorreta = true;
       }
        return estaCorreta;
    }
    public String perguntaVF(String enunciado,String afirmativa,String respostaCorreta){

    }
}
