package com.willis.log

/**
 * Created by Sion on 04/01/14.
 */
class Source {

    def name
    def files = [] as Set

    Source (String name ){
        this.name = name
    }

    void localFile (File file){
        if (file){
            files << file.absoluteFile.canonicalFile
        }
    }

    void localFile (String file){
        localFile(new File(file))
    }
}
