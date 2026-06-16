import { useState } from "react";
import TailorDashboard from "./TailorDashboard";
import "./index.css";

function App() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [role, setRole] = useState("USER");
  const [darkMode, setDarkMode] = useState(false);
  const [showPassword, setShowPassword] = useState(false);
  const [loggedIn, setLoggedIn] = useState(false);

  const handleLogin = async (e) => {
    e.preventDefault();

    try {
      const response = await fetch(
        "http://localhost:8080/api/auth/login",
        {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify({
            username,
            password,
            role,
          }),
        }
      );

      const message = await response.text();

      if (response.ok) {
        alert(message);

        if (role === "TAILOR") {
          setLoggedIn(true);
        }
      } else {
        alert(message);
      }
    } catch (error) {
      alert("Backend connection failed");
    }
  };

  if (loggedIn && role === "TAILOR") {
    return (
      <TailorDashboard
        username={username}
        role={role}
        onLogout={() => setLoggedIn(false)}
      />
    );
  }

  return (
    <div className={`app ${darkMode ? "dark-mode" : ""}`}>
      <button
        className="theme-btn"
        onClick={() => setDarkMode(!darkMode)}
      >
        {darkMode ? "☀️" : "🌙"}
      </button>

      <div className="split-container">
        <div className="left-panel">
          <div className="logo">🧵</div>

          <h1 className="brand-name">TailorsGo</h1>

          <p className="brand-description">
            TailorsGo helps customers and tailors connect on a
            single platform. Customers can discover skilled
            tailors, compare options, and choose the perfect
            tailor for their clothing needs.
          </p>

          <p className="brand-description">
            Tailors can efficiently manage orders, customer
            measurements, appointments, and delivery schedules
            through one professional system.
          </p>
        </div>

        <div className="right-panel">
          <div className="login-card">
            <h2>Welcome Back</h2>
            <p className="subtitle">Login to continue</p>

            <form onSubmit={handleLogin}>
              <div className="input-group">
                <label>Username</label>
                <input
                  type="text"
                  placeholder="Enter your username"
                  value={username}
                  onChange={(e) =>
                    setUsername(e.target.value)
                  }
                />
              </div>

              <div className="input-group">
                <label>Password</label>

                <input
                  type={
                    showPassword ? "text" : "password"
                  }
                  placeholder="Enter your password"
                  value={password}
                  onChange={(e) =>
                    setPassword(e.target.value)
                  }
                />

                <div className="show-password">
                  <input
                    type="checkbox"
                    id="showPassword"
                    checked={showPassword}
                    onChange={() =>
                      setShowPassword(!showPassword)
                    }
                  />

                  <label htmlFor="showPassword">
                    Show Password
                  </label>
                </div>
              </div>

              <div className="input-group">
                <label>Login As</label>

                <select
                  value={role}
                  onChange={(e) =>
                    setRole(e.target.value)
                  }
                >
                  <option value="USER">User</option>
                  <option value="TAILOR">Tailor</option>
                  <option value="ADMIN">Admin</option>
                </select>
              </div>

              <button
                type="submit"
                className="login-btn"
              >
                Login
              </button>
            </form>
          </div>
        </div>
      </div>

      <footer>
        For issues contact:
        <span> abcd@gmail.com</span>
      </footer>
    </div>
  );
}

export default App;