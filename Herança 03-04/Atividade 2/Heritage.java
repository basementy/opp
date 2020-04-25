public class Heritage {
	public static void main(String[] args) {
		PessoaFisica firstPerson = new PessoaFisica("Gabriel", "Joinville", "(47) 99170-7535", "105.774.031-07");
		PessoaFisica secondPerson = new PessoaFisica("Mateus", "Curitiba", "(42) 99572-7215", "233.164.217-24");
		PessoaFisica thirtyPerson = new PessoaFisica("Fernando", "Blumenal", "(47) 99235-1144", "225.172.431-39");

		PessoaJuridica firstCompany = new PessoaJuridica("Metalurgica", "São Paulo", "(11) 99430-9843", "23.123.123/1231-23", "Metal Rocha");
		PessoaJuridica secondCompany = new PessoaJuridica("Consultoria", "Curitiba", "(42) 99444-4323", "98.984.934/1231-23", "RH Partners");
		PessoaJuridica thirtyCompany = new PessoaJuridica("Mercado", "Juiz de Fora", "(11) 99342-3165", "57.437.847/8378-72", "Kunz");

		System.out.println("\nPessoas: ");
		firstPerson.printInfo();
		secondPerson.printInfo();
		thirtyPerson.printInfo();

		System.out.println("\nEmpresas:");
		firstCompany.printInfo();
		secondCompany.printInfo();
		thirtyCompany.printInfo();
	}
}