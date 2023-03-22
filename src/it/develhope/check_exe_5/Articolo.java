package it.develhope.check_exe_5;

public class Articolo extends Product implements Sconto{

    private int idTot = 0;
    private int id;
    private String descrizione;
    private double sconto;
    private TipoProdotto tipoProdotto;

    public Articolo(String name, int price, String descrizione, TipoProdotto tipoProdotto) {
        super(name, price);
        this.id = ++idTot;
        this.descrizione = descrizione;
        this.tipoProdotto = tipoProdotto;
    }

    public int getIdTot() {
        return idTot;
    }

    public void setIdTot(int idTot) {
        this.idTot = idTot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoProdotto getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(TipoProdotto tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    @Override
    public void applicaSconto(double applicaSconto) {
        this.sconto = applicaSconto;
    }

    @Override
    public double calcolaPrezzoScontato(Product p) {
        return (p.getPrice() / 100) * (100 - sconto);
    }
}
