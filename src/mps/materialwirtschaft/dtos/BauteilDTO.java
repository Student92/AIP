package mps.materialwirtschaft.dtos;

/**
 * Created with IntelliJ IDEA.
 * User: r3l4x
 * Date: 12.11.13
 * Time: 18:25
 * To change this template use File | Settings | File Templates.
 */
public class BauteilDTO {

    private StuecklisteDTO stueckliste;
    private String name;
    private int nr;

    public BauteilDTO(StuecklisteDTO stueckListe, String name, int nr) {
        this.stueckliste = stueckListe;
        this.name = name;
        this.nr = nr;
    }

    public StuecklisteDTO getStueckliste() {
        return stueckliste;
    }

    public void setStueckliste(StuecklisteDTO stueckliste) {
        this.stueckliste = stueckliste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
