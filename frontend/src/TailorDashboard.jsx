import { useState } from "react";
import "./dashboard.css";

function TailorDashboard({
  username,
  role,
  onLogout,
}) {
  const [darkMode, setDarkMode] = useState(false);

  return (
    <div
      className={`dashboard ${
        darkMode ? "dark-mode" : ""
      }`}
    >
      <header className="header">
        <h1>TailorsGo</h1>

        <div className="header-right">
          <div className="user-info">
            <span className="username">
              {username}
            </span>

            <span className="role">
              {role}
            </span>
          </div>

          <button
            className="logout-btn"
            onClick={onLogout}
          >
            Logout
          </button>

          <button
            className="theme-btn"
            onClick={() =>
              setDarkMode(!darkMode)
            }
          >
            {darkMode ? "☀️" : "🌙"}
          </button>
        </div>
      </header>

      <div className="stats-container">
        <div className="stat-card">
          <h3>Pending Orders</h3>
          <p>12</p>
        </div>

        <div className="stat-card">
          <h3>Total Customers</h3>
          <p>87</p>
        </div>

        <div className="stat-card">
          <h3>Revenue This Month</h3>
          <p>₹42,500</p>
        </div>
      </div>

      <div className="action-container">
        <div className="action-card">
          <h2>Create New Customer Data</h2>

          <p>
            Add customer details,
            measurements, cloth information
            and order details.
          </p>

          <button>Open</button>
        </div>

        <div className="action-card">
          <h2>Track Orders</h2>

          <p>
            View pending, in progress and
            delivered orders in one place.
          </p>

          <button>Open</button>
        </div>

        <div className="action-card">
          <h2>Manage Customer Data</h2>

          <p>
            Search, edit, delete and manage
            all customer records.
          </p>

          <button>Open</button>
        </div>

        <div className="action-card revenue-card">
          <h2>Total Revenue</h2>

          <h1>₹42,500</h1>

          <p>Current Month Earnings</p>
        </div>
      </div>

      <footer className="dashboard-footer">
        For issues contact:
        <span> abcd@gmail.com</span>
      </footer>
    </div>
  );
}

export default TailorDashboard;