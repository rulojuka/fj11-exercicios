package br.com.caelum.contas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class RepositorioDeContas {
	public void salva(List<Conta> contas) {
		try {
			PrintStream stream = new PrintStream("contas.txt");
			for (Conta conta : contas) {
				stream.println(conta.getTipo() + "," + conta.getNumero() + "," + conta.getAgencia() + ","
						+ conta.getTitular() + "," + conta.getSaldo());
			}
			stream.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Conta> carrega() {
		List<Conta> listaDeContas = new ArrayList<Conta>();

		Scanner scanner;
		try {
			scanner = new Scanner(new FileInputStream("contas.txt"));
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				String[] valores = linha.split(",");
				String tipo = valores[0];
				String numero = valores[1];
				String agencia = valores[2];
				String titular = valores[3];
				String saldo = valores[4];
				Conta novaConta;
				if (new ContaCorrente().getTipo().equals(tipo)) {
					novaConta = new ContaCorrente();
				} else {
					novaConta = new ContaPoupanca();
				}
				novaConta.setNumero(Integer.parseInt(numero));
				novaConta.setAgencia(agencia);
				novaConta.setTitular(titular);
				novaConta.deposita(Double.parseDouble(saldo));
				listaDeContas.add(novaConta);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo contas.txt não encontrado. Inicializando sem as contas salvas.");
		}
		return listaDeContas;
	}

}
