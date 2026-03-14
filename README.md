# 🛒 LuxeMart — Full Stack E-Commerce Application

A full-stack e-commerce web application built with **Spring Boot** (backend) and **React** (frontend), featuring product management, image upload, cart functionality, and order management.

---

## 🖥️ Tech Stack

### Backend
- Java 17 + Spring Boot 3
- Spring Data JPA / Hibernate
- PostgreSQL
- Maven

### Frontend
- React + Vite
- Bootstrap 5 + Bootstrap Icons
- Axios
- React Router DOM
- React Toastify

---

## ✨ Features

- 📦 **Product Management** — Add, view, update, and delete products with image upload
- 🖼️ **Image Storage** — Product images stored as `bytea` in PostgreSQL
- 🛒 **Shopping Cart** — Add/remove items, adjust quantity, view total
- 📋 **Order Management** — Place orders, update stock, view order history
- 🔍 **Search** — Search products by name or brand
- 📂 **Category Filter** — Filter products by category
- 🌙 **Dark / Light Theme** — Toggle between themes

---

## 📁 Project Structure

```
backend/
├── controller/
│   ├── ProductController.java
│   └── OrderController.java
├── Service/
│   ├── ProductService.java
│   └── OrderService.java
├── Repo/
│   ├── ProductRepo.java
│   ├── OrderRepo.java
│   └── OrderItemRepo.java
├── model/
│   ├── Product.java
│   ├── Orders.java
│   ├── OrderItem.java
│   └── dto/
│       ├── OrderRequest.java
│       ├── OrderResponse.java
│       └── OrderItemResponse.java
└── config/
    └── CorsConfig.java

frontend/
├── src/
│   ├── components/
│   │   ├── Home.jsx
│   │   ├── Navbar.jsx
│   │   ├── Product.jsx
│   │   ├── Cart.jsx
│   │   ├── CheckoutPopup.jsx
│   │   ├── AddProduct.jsx
│   │   ├── UpdateProduct.jsx
│   │   ├── Order.jsx
│   │   └── SearchResults.jsx
│   └── Context/
│       └── Context.jsx
```

---

## ⚙️ Getting Started

### Prerequisites
- Java 17+
- Node.js 18+
- PostgreSQL 14+
- Maven

---

### 1. Database Setup

Create a PostgreSQL database:

```sql
CREATE DATABASE Ecom;
```

---

### 2. Backend Setup

1. Clone the repository and navigate to the backend folder.

2. Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/Ecom
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

3. Run the backend:

```bash
mvn spring-boot:run
```

Backend runs on `http://localhost:8080`

---

### 3. Frontend Setup

1. Navigate to the frontend folder.

2. Create a `.env` file:

```env
VITE_BASE_URL=http://localhost:8080
```

3. Install dependencies and run:

```bash
npm install
npm run dev
```

Frontend runs on `http://localhost:5173`

---

### 4. Insert Sample Data (Optional)

With both servers running, execute the seed script to populate 10 products with real images:

```bash
node insertProducts.cjs
```

---

## 🔌 API Endpoints

### Products

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/products` | Get all products |
| GET | `/api/product/{id}` | Get product by ID |
| GET | `/api/product/{id}/image` | Get product image |
| POST | `/api/product` | Add new product |
| PUT | `/api/product/{id}` | Update product |
| DELETE | `/api/product/{id}` | Delete product |
| GET | `/api/products/search?keyword=` | Search products |

### Orders

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/orders/place` | Place an order |
| GET | `/api/orders` | Get all orders |

---

## 📸 Screenshots

> Add screenshots of your app here

| Home Page | Product Detail | Cart | Orders |
|-----------|---------------|------|--------|
| ![Home](#) | ![Product](#) | ![Cart](#) | ![Orders](#) |

---

## 🐛 Known Issues Fixed

- Removed `@Lob` annotation from `imageData` to fix Hibernate `bytea` vs `bigint` type mismatch
- Used `@Table(name = "orders")` to avoid PostgreSQL reserved keyword conflict
- Added `@Transactional` on `deleteByProductId` to handle FK constraint on delete
- Stripped `imageData` from frontend JSON payload to prevent type mismatch on update

---

## 👨‍💻 Author

Built with ❤️ using Spring Boot + React

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
