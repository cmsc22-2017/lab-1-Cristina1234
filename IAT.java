interface IAT {
}
class Unknown implements IAT {
	   Unknown() { }
}

class Personn implements IAT {
	String name;
	IAT mom;
	IAT dad;
	    
	Personn(String name,IAT mom, IAT dad) {
		this.name = name;
		this.mom = mom;
	    this.dad = dad;
	}
}

class ExamplesIAT {
	IAT unknown = new Unknown();
	IAT maria = new Personn("Maria Cimafranca", this.unknown, this.unknown);
    IAT luis = new Personn("Luis Ongcoy", this.unknown, this.unknown);
    IAT mimi = new Personn("Mimi Ongcoy", this.maria, this.luis);
    IAT susima = new Personn("Susima Saguran", this.unknown, this.unknown);
    IAT pastor = new Personn("Pastor Lorete", this.unknown, this.unknown);
    IAT narciso = new Personn("Narciso Lorete",this.susima, this.pastor);
    IAT lolito = new Personn("Lolito Dayuday", this.unknown, this.unknown);
    IAT aquilina = new Personn("Aquilina Patenio", this.unknown, this.unknown);
    IAT mata = new Personn("Mata Dayuday", this.aquilina, this.lolito);
    IAT dolores = new Personn("Dolores Lorete", this.mimi, this.narciso);
    IAT cristina = new Personn("Maria Cristina Dayuday", this.dolores, this.mata);
}