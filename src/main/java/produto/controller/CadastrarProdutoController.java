package produto.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastrarProdutoController
 */
@WebServlet("/CadastrarProdutoController")
public class CadastrarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastrarProdutoController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String descricao = request.getParameter("descricao");
		Integer quantidade;
		Double preco;
		Boolean dispOnLine = false;

		if (descricao != null && !descricao.isEmpty() && request.getParameter("quantidade") != null
				&& !request.getParameter("quantidade").isEmpty() && request.getParameter("preco") != null
				&& !request.getParameter("preco").isEmpty()) {
			quantidade = Integer.parseInt(request.getParameter("quantidade"));
			preco = Double.parseDouble(request.getParameter("preco"));
			System.out.println("Descrição = " + descricao);
			System.out.println("Quantidade = " + quantidade);
			System.out.println("Preço = " + preco);
			if (request.getParameter("dispOnLine") != null && request.getParameter("dispOnLine").equals("on")) {
				dispOnLine = true;
				System.out.println("Disponível OnLine = " + dispOnLine);
			}
		}
	}
}
