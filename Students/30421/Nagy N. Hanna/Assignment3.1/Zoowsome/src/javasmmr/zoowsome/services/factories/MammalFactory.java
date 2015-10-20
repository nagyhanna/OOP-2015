package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animals getAnimal(String type) {
		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger(); // leave empty constructor, for now!
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		} else if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow();
		} else {

			// this try-catch is just because I had some errors
			// if I've just written: throw new Exception("Invalid species
			// exception");
			// I don not know why ...
			try {
				throw new Exception("Invalid animals exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;

	}
}