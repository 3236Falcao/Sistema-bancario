package br.com.sistemabancario;

import javax.swing.JOptionPane;

public class ContaCorrente {
	
		private double saldo;
		private int numero;
		private double limite;
		private double chequeEspecial;
		private Cliente cliente;
		
		public double getChequeEspecial() {
			return chequeEspecial;
		}
		public void setChequeEspecial(double chequeEspecial) {
			this.chequeEspecial = chequeEspecial;
		}
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		public double getLimite() {
			limite = chequeEspecial + saldo;
			return limite;
		}
		
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public void sacar(double valor) {
			if(getLimite() >= valor) {
				this.saldo = saldo - valor;
			}else {
				JOptionPane.showMessageDialog(null, "Saldo insuficiente");
			}
		}
		
		public void depositar(double valor) {
			this.saldo = this.saldo + valor;
		}
	}

