package testes;

import java.util.List;

public class Produto {
        private String nome;
        private String descricao;
        private List<String> tags;
        
        public Produto(String nome, String descricao){
            this.nome = nome;
            this.descricao = descricao;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }
        
    public Produto adicionarTagsDeOutroProduto(Produto produto){
            this.tags.addAll(produto.getTags());
            return this;
        }
}
