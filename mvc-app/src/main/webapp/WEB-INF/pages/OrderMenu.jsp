<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1" />
        <title>Order Menu Application</title>
        <style>
            :root {
                box-sizing: border-box;

                --primary: #394149;
                --secondary: #117de9;
            }

            *,
            *::after,
            *::before {
                margin: 0;
                padding: 0;

                box-sizing: inherit;
            }

            body {
                font-family: "Brandon Grotesque", "Helvetica", sans-serif;
                font-size: 1rem;
            }

            header {
                display: flex;
                justify-content: space-between;
                padding: 2em;
                align-items: center;
            }

            .hamburger {
                --hm-width: 3em;
                --hm-height: 0.4em;
                --spacing: calc(var(--hm-width) / 4);

                width: var(--hm-width);
                height: var(--hm-height);
                background-color: var(--primary);
                position: relative;
                transition: transform 0.8s ease-in-out;

                z-index: 100;
            }
            .hamburger::after,
            .hamburger::before {
                content: "";
                width: 50%;
                height: inherit;
                background-color: var(--primary);
                display: block;
                position: absolute;
                top: 0;
                left: 0;
                transition: transform 0.8s ease-in-out;
            }
            .hamburger::after {
                top: calc(-1 * var(--spacing));
            }
            .hamburger::before {
                top: var(--spacing);
                left: 50%;
            }

            .close.hamburger::before,
            .close.hamburger::after {
                left: 50%;
                transform: translate(-50%) rotate(-450deg);
                background-color: white;
            }
            .close.hamburger {
                transform: rotate(45deg);
                background-color: white;
            }

            nav {
                position: absolute;
                background-color: var(--secondary);
                left: 0;
                top: 0;
                right: 0;
                bottom: 0;

                display: flex;
                justify-content: center;
                align-items: center;

                transform: scaleX(0);
                transform-origin: left center;
                opacity: 0;
                transition: transform 0.3s ease-in-out, opacity 0.2s ease-in;
            }

            .reveal-nav {
                transform: scaleX(1);
                opacity: 1;
            }

            .menu {
                list-style: none;
            }
            .menu-item {
                color: #fff;
                text-decoration: none;
                font-size: calc(1.5rem + 2vw);
                opacity: 0;
                transform: translate(-20em);
                display: block;
                transition: transform 0.8s ease-in-out, opacity 0.3s ease-in;
            }
            .menu li + li {
                margin-top: 1em;
            }

            .reveal-items .menu-item {
                transform: translate(0);
                opacity: 1;
            }

            .reveal-items li:nth-child(1) .menu-item {
                transition-delay: 0.1s;
            }
            .reveal-items li:nth-child(2) .menu-item {
                transition-delay: 0.2s;
            }

            .reveal-items li:nth-child(3) .menu-item {
                transition-delay: 0.3s;
            }

            .reveal-items li:nth-child(4) .menu-item {
                transition-delay: 0.4s;
            }

            .reveal-items li:nth-child(5) .menu-item {
                transition-delay: 0.5s;
            }

            main {
                width: 100vw;
                height: calc(100vh - 6.668em);
                background: var(--primary)
                    url("https://images.unsplash.com/photo-1557821552-17105176677c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1332&q=80")
                    no-repeat center center / cover;

                display: flex;
                align-items: center;
                justify-content: center;
            }

            main section {
                width: 80%;
                color: white;
                margin: auto;
                text-align: center;
            }

            section h1 {
                font-size: calc(1.5rem + 2.5vw);
                margin-bottom: 0.3em;
                line-height: 1.2;
            }

            section p {
                font-size: calc(0.9rem + 1vw);
            }
        </style>
    </head>
    <body>
        <header>

            <a href="#" class="hamburger"></a>

            <nav>
                <ul class="menu">
                    <li>
                        <a href="/order-section" class="menu-item"
                            >Search Order By User</a
                        >
                    </li>
                    <li>
                        <a href="/order-by-id" class="menu-item"
                            >Search Order By Id</a
                        >
                    </li>
                    <li>
                        <a href="/add-order" class="menu-item">Add Order</a>
                    </li>
                    <li>
                        <a href="/update-order" class="menu-item">
                            Update Order
                        </a>
                    </li>
                    <li><a href="/" class="menu-item">HomePage</a></li>
                </ul>
            </nav>
        </header>
        <main>
            <section>
                <h1>Lumen's Order Menu</h1>
                <p>
                    Click on the three dots on the top left corner for
                    navigation.
                </p>
            </section>
        </main>
    </body>
    <script>
        let hamburger = document.querySelector(".hamburger");
        let nav = document.querySelector("nav");
        let menu = document.querySelector(".menu");
        hamburger = hamburger.addEventListener("click", function () {
            this.classList.toggle("close");
            nav.classList.toggle("reveal-nav");
            menu.classList.toggle("reveal-items");
        });
    </script>
</html>
