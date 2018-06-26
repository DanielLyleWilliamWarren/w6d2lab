public enum GenreType {
    CRIME("Murder"),
    RELIGIOUS("Bible"),
    TRAVEL("Places to go");

    private final String value;

    GenreType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
