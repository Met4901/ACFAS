






println "allo"

println this


println this.class

println "========= Les méthodes "
this.class.methods.each {   println it }
println "========= Les méthodes FIN "


println "   "
println "   "
println "========= Les méthodes get"
this.class.methods.name.grep(~/get.*/).sort() { println it }
println "========= Les méthodes FIN "


println this.class.methods.name.grep(~/get.*/).sort()


List serie = [1, 2, 3]
List serieInc = serie.collect { entier ->
  entier+1
}
assert serieInc == [2, 3, 4]



def builder = new groovy.json.JsonBuilder()
def root = builder.people {
	person {
		firstName 'Guillame'
		lastName 'Laforge'
		// Named arguments are valid values for objects too
		address(
				city: 'Paris',
				country: 'France',
				zip: 12345,
		)
		married true
		// a list of values
		conferences 'JavaOne', 'Gr8conf'
	}
}

// creates a data structure made of maps (Json object) and lists (Json array)
assert root instanceof Map

assert builder.toString() == '{"people":{"person":{"firstName":"Guillame","lastName":"Laforge","address":{"city":"Paris","country":"France","zip":12345},"married":true,"conferences":["JavaOne","Gr8conf"]}}}'

println ""

println root

println ""

println builder.toPrettyString()




class Truc { }

	//Cette Classe ne dispose d’aucun comportement, ni même d’aucune propriété.
	//Maintenant, voici un comportement Comportement, proposant la méthode comportement() :

class Comportement {
	def comportement() {
		"J’ai un comportement !"
	}
}

def truc = new Truc()
Truc.mixin Comportement // On attribue le comportement Comportement à la classe Truc
def truc2 = new Truc()

//shouldFail println truc.comportement() // lève groovy.lang.MissingMethodException
println truc2.comportement() // Affiche "J’ai un comportement !"




def fact = 0..10 // type Range
fact.each {
	def i = it;
	fact.each {
		println "$i x $it = " + it * i
	}
	println "**"
}



InetAddress.getAllByName(
		"www.google.com"
		).each{println it}

//
//InetAddress.getByName(
//		"www.google.com"
//		).hostAddress
//
//
//InetAddress.getByName(
//		"64.233.167.99"
//		).canonicalHostName


	
	
	
		

def page =
		new
		URL(
		"http://www.aboutgroovy.com"
		).text



new
		URL(
		"http://www.aboutgroovy.com"
		).eachLine{line -> println line }

	