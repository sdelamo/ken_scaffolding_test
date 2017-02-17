package scaffolding_tests

class Country {
    Short id
    String name
    Date lastUpdated

    static hasMany = [cities: City]

    String toString() { name }

    static mapping = {
        id column: 'country_id'
        name column: 'country'
        lastUpdated column: 'last_update'
        version false
        //datasource 'sakila'
    }

    static constraints = {
        name blank: false
    }
}