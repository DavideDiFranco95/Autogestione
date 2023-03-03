package Esercizio03_03_2023;

public enum EnumUser {
    ADMIN(true,false,true),
    SUPER_HOST(true,false,true),
    HOST(true,true,true),
    REGISTERED(false,false,true),
    GUEST(false,false,false)
    ;
    final public boolean canPostHouse;
    final public boolean canBeSuperHost;
    final public boolean canBook;

    EnumUser(boolean canPostHouse, boolean canBeSuperHost,boolean canBook){
        this.canPostHouse=canPostHouse;
        this.canBeSuperHost=canBeSuperHost;
        this.canBook=canBook;
    }
    public boolean isAdmin(){
        return this.ordinal()<4;
    }

    @Override
    public String toString() {
        return "EnumUser{" +
                "nome=" + this.getName() +
                "canPostHouse=" + canPostHouse +
                ", canBeSuperHost=" + canBeSuperHost +
                '}';
    }

    private String getName(){
        return this.name();
    }
}
