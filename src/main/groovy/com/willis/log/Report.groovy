package com.willis.log

/**
 * Created by Sion on 04/01/14.
 */
class Report {

    def name
    def sumColumns = [] as Set
    def avgColumns = [] as Set
    def groupByColumns = [] as Set

    Report (String name){
        this.name = name
    }

    void sum (String columnName){
        sumColumns << columnName
    }

    void avg (String columnName){
        avgColumns << columnName
    }

    void groupBy (String columnName){
        groupByColumns << columnName
    }
}
