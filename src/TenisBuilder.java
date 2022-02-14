public class TenisBuilder {

    private Tenis tenis;

    public TenisBuilder(){
        tenis = new Tenis();
    };

    public Tenis Build(){
        if (tenis.getid() == 0){
            throw new IllegalArgumentException("id invalido");
        }
        if (tenis.getNome().equals("")){
            throw new IllegalArgumentException("Nome inválido");
        }

        if(tenis.getMarca().equals("")){
            throw new IllegalArgumentException("Marca inválida");
        }
        return tenis;
    }

    public TenisBuilder setId(int id){
        tenis.setid(id);
        return this;
    }

    public TenisBuilder setNome(String nome){
        tenis.setNome(nome);
        return this;
    }

    public TenisBuilder setMarca(String marca){
        tenis.setMarca(marca);
        return this;
    }

    public TenisBuilder setPreco(double preco){
        tenis.setPreco(preco);
        return this;
    }




}
