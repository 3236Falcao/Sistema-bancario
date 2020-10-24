package br.com.sistemabancario;

import javax.swing.JOptionPane;

public class AberturaConta {

		
		public static ContaCorrente conta;
		
		public static void main(String[] args) {
			
			Cliente daniel = new Cliente("Daniel", "Falcão", "123.456.789-00");
			conta = new ContaCorrente();
			conta.setCliente(daniel);
			conta.setNumero(123245);
			conta.setSaldo(100);
			conta.setChequeEspecial(500);
			
			int opcao = 0;
			while(opcao != 4) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1 - Sacar\n2 - Depositar\n3 - VerSaldo\n4 - Sair"));

			double valor;
			switch (opcao) {
			case 1:
				valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja sacar:"));
				sacar(valor);
				break;
			case 2:
				valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja depositar:"));
				depositar(valor);
				break;
			case 3:
				verSaldo();
				break;
			case 4:
				opcao = 4;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				break;
			}
		  }
		}

		private static void verSaldo() {
			JOptionPane.showMessageDialog(null, "Seu saldo é: "+conta.getSaldo());
		}

		private static void depositar(double valor) {
			conta.depositar(valor);
		}

		private static void sacar(double valor) {
			conta.sacar(valor);
		}
	}

