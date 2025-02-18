package cliente;

import bastrato.Endereco;

public class Cliente {

        private String nome;
        private String email;
        private String senha;
        private Endereco endereco;

        public Cliente() {
        }
        

         

    @Override
        public String toString() {
            return "Cliente [nome=" + nome + ", email=" + email + ", senha=" + senha + ", endereco=" + endereco + "]";
        }

    public Cliente(String nome, String email, String senha, Endereco endereco) {
            this.nome = nome;
            this.email = email;
            this.senha = senha;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }


     
        
    }


    


