package produto.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produto.model.Produto;

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

		Boolean dispOnLine = false;
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastraProduto.jsp");
		String mensagem;

		try {
			if (descricao != null && !descricao.isEmpty() && request.getParameter("quantidade") != null
					&& !request.getParameter("quantidade").isEmpty() && request.getParameter("preco") != null
					&& !request.getParameter("preco").isEmpty()) {
				Integer quantidade = Integer.valueOf(request.getParameter("quantidade"));
				Double preco = Double.valueOf(request.getParameter("preco"));
				if (request.getParameter("dispOnLine") != null && request.getParameter("dispOnLine").equals("on")) {
					dispOnLine = true;
				}
				Produto produto = new Produto(descricao, quantidade, preco, dispOnLine);
				produto.salvar();

				mensagem = "Produto cadastrado com sucesso.";
			} else {
				mensagem = "Os campos devem ser preenchidos corretamente.";
			}
			request.setAttribute("mensagem", mensagem);
			dispatcher.forward(request, response);
		} catch (NumberFormatException e) {
			mensagem = "Os campos devem ser preenchidos com os formatos corretos.";
			request.setAttribute("mensagem", mensagem);
			dispatcher.forward(request, response);
		}
	}
}
