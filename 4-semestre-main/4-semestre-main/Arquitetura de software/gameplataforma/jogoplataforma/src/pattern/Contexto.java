package pattern;

public final class Contexto {
        private Estado estado;

        public Contexto(){
            estado = new Esperando();
        }


}
