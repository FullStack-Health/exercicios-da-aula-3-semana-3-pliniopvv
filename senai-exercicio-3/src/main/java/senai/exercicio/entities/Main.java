package senai.exercicio.entities;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class Main {

	public static void main(String[] args) {
		Faker faker = new Faker();
		List<Jogador> jogadores = new ArrayList<>();
		String[] posicoes = { "Goleiro", "Lateral Direito", "Zagueiro Central", "Zagueiro Central", "Lateral Esquerdo",
				"Meio-Campista Defensivo", "Meio-Campista Central", "Meio-Campista Central", "Meio-Campista Ofensivo",
				"Atacante", "Atacante" };

		for (int i = 0; i < 10; i++) {
			Jogador j = new Jogador();
			j.setId(i);
			j.setNome(faker.name().fullName());
			j.setApelido(faker.name().username());
			j.setCartoes((int) Math.random() * 10);
			j.setQualidade((int) Math.random() * 10);
			j.setNumero(i);
			j.setPosicao(posicoes[i]);
			j.setSuspenso(false);
			jogadores.add(j);
		}
		
		for (Jogador jogador : jogadores)
			System.out.println("Nome: " + jogador.getNome());

	}

}
