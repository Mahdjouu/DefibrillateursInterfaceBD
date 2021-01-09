package mapping;

public class Structure {

    private String typeStructure;
    private String categorieStructure;
    private String accessibilite;

    public Structure(String typeStructure, String categorieStructure, String accessibilite) {
        this.typeStructure = typeStructure;
        this.categorieStructure = categorieStructure;
        this.accessibilite = accessibilite;
    }

    public String getTypeStructure() {
        return typeStructure;
    }

    public void setTypeStructure(String typeStructure) {
        this.typeStructure = typeStructure;
    }

    public String getCategorieStructure() {
        return categorieStructure;
    }

    public void setCategorieStructure(String categorieStructure) {
        this.categorieStructure = categorieStructure;
    }

    public String getAccessibilite() {
        return accessibilite;
    }

    public void setAccessibilite(String accessibilite) {
        this.accessibilite = accessibilite;
    }
}
