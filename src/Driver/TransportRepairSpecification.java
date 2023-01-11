package Driver;

public enum TransportRepairSpecification {
    SPECIFICATION_CAR( "Ремонт легкового транспорта" ),
    SPECIFICATION_TRUCK( "Ремонт грузового транспорта" ),
    SPECIFICATION_BUS( "Ремонт автобусов" ),
    SPECIFICATION_UNIVERSAL( "Ремонт всех типов транспорта" );

    private final String specification;

    TransportRepairSpecification(String specification) {
        this.specification = specification;
    }

    public String getSpecification() {
        return specification;
    }

    @Override
    public String toString() {
        return " " + getSpecification() + " ";
    }
}
