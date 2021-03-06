package isi.died.tp.estructuras;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinarioBusqueda<E extends Comparable<E>> extends Arbol<E> {

	protected Arbol<E> izquierdo;
	protected Arbol<E> derecho;
	
	public ArbolBinarioBusqueda(){
		this.valor=null;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinarioBusqueda(E e){
		this.valor=e;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinarioBusqueda(E e,Arbol<E> i,Arbol<E> d){
		this.valor=e;
		this.izquierdo=i;
		this.derecho=d;
	}
	
	@Override
	public List<E> preOrden() {
		List<E> lista = new ArrayList<E>();
		lista.add(this.valor);
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> inOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.add(this.valor);
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> posOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		lista.add(this.valor);
		return lista;

	}
	@Override
	public boolean esVacio() {
		return false;
	}
        
	@Override
	public E valor() {
		return this.valor;
	}
	
	@Override
	public Arbol<E> izquierdo() {
		return this.izquierdo;
	}
	
	@Override
	public Arbol<E> derecho() {
		return this.derecho;
	}


	@Override
	public void agregar(E a) {
		if(this.valor.compareTo(a)<1) {
			if (this.derecho.esVacio()) this.derecho = new ArbolBinarioBusqueda<E>(a);
			else this.derecho.agregar(a);
		}else {
			if (this.izquierdo.esVacio()) this.izquierdo= new ArbolBinarioBusqueda<E>(a);
			else this.izquierdo.agregar(a);
		}
	}
	
	@Override
	public boolean equals(Arbol<E> unArbol) {
		// 1.b Guia06
		return this.valor.equals(unArbol.valor()) && this.izquierdo.equals(unArbol.izquierdo()) && this.derecho.equals(unArbol.derecho());
	}

	@Override
	public boolean contiene(E unValor) {
		// TODO 1.a
		if(this.valor.equals(unValor)) {
			return true;
		} else if (this.valor().compareTo(unValor) > 0 && !this.izquierdo.esVacio()) {
			return this.izquierdo.contiene(unValor);
		} else if (this.valor().compareTo(unValor) < 0 && !this.derecho.esVacio()) {
			return this.derecho.contiene(unValor);
		}
		return false;
	}

	@Override
	public int profundidad() {
		// TODO 1.c Guia06
		if(this.izquierdo.esVacio() && this.derecho.esVacio()) {
			return 1;
		} else if (this.izquierdo.profundidad() >= this.derecho.profundidad()){
			return this.izquierdo.profundidad() + 1;
		} else {
			return this.derecho.profundidad() + 1;
		}
	}

	@Override
	public int cuentaNodosDeNivel(int nivel) {
		// TODO 1.e Guia06
		if (nivel == 0) {
			return 1;
		} else if (this.izquierdo.esVacio() && !this.derecho.esVacio()){
			return this.derecho.cuentaNodosDeNivel(nivel - 1);
		} else if (!this.izquierdo.esVacio() && this.derecho.esVacio()) {
			return this.izquierdo.cuentaNodosDeNivel(nivel - 1);
		} else {
			return this.derecho.cuentaNodosDeNivel(nivel - 1) + this.izquierdo.cuentaNodosDeNivel(nivel - 1);
		}
	}

	@Override
	public boolean esCompleto() {
		// TODO 1.g Guia06
		if (this.izquierdo.cuentaHojasRec() < this.derecho.cuentaHojasRec()) {
			return false;
		} else if(this.izquierdo.esVacio() && this.derecho.esVacio()) {
			return true;
		} else if(!this.izquierdo.esVacio() && !this.derecho.esVacio()) {
			return this.izquierdo.esCompleto() && this.derecho.esCompleto();
		} else if(!this.izquierdo.esVacio() && this.derecho.esVacio()) {
			return this.izquierdo.esCompleto();
		} else {
			return false;
		}
	}

	@Override
	public boolean esLleno() {
		// TODO 1.f Guia06
		if (this.izquierdo.esVacio() && this.derecho.esVacio() ) {
			return true;
		} else if ((!this.izquierdo.esVacio() && !this.derecho.esVacio()) && (this.izquierdo.profundidad() == this.derecho.profundidad())) {
			return this.izquierdo.esLleno() ^ this.derecho.esLleno();
		} else {
			return false;
		}
	}
	
	//1.d Guia06
	@Override
	public int cuentaHojasRec() {
		if(this.izquierdo.esVacio() && this.derecho.esVacio()) {
			return 1;
		} else if(!this.izquierdo.esVacio() && !this.derecho.esVacio()) {
			return this.izquierdo().cuentaHojasRec() + this.derecho.cuentaHojasRec();
		} else if(!this.izquierdo.esVacio() && this.derecho.esVacio()) {
			return this.izquierdo().cuentaHojasRec();
		} else if(this.izquierdo.esVacio() && !this.derecho.esVacio()) {
			return this.derecho.cuentaHojasRec();
		}
		return 0;
	}

}
