package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Nico");
//		cliente.setProfissao("Desenvolvedor");
//		cliente.setCpf("000.000.000-00");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		
//		String nome = "Nico Steppat";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente.getNome());
//		System.out.println(cliente.getProfissao());
//		System.out.println(cliente.getCpf());
//		System.out.println(cliente.getNomeCpf());
		
		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Desenvolvedor");
		cliente.setCpf("000.000.000-00");
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		cc.setTitular(cliente);
		cc.Depositar(200.00);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
		
	}

}
