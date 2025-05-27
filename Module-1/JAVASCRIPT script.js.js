console.log("Welcome to the Community Portal");

function pageLoaded() {
  alert("Page fully loaded");
  const saved = localStorage.getItem("preferredEvent");
  if (saved) {
    document.querySelector("select[name='eventType']").value = saved;
  }
}

function registerUser(event) {
  event.preventDefault();
  alert("Thanks for registering!");
  document.querySelector("output").textContent = "Form submitted successfully!";
}

function savePreference(value) {
  localStorage.setItem("preferredEvent", value);
}

function clearPrefs() {
  localStorage.clear();
  sessionStorage.clear();
  alert("Preferences cleared");
}

function countChars(textarea) {
  const count = textarea.value.length;
  document.getElementById("charCount").textContent = count + " characters";
}

function findEvents() {
  if (!navigator.geolocation) {
    alert("Geolocation not supported.");
    return;
  }
  navigator.geolocation.getCurrentPosition(
    (position) => {
      const coords = "Latitude: " + position.coords.latitude + ", Longitude: " + position.coords.longitude;
      document.getElementById("location").textContent = coords;
    },
    (err) => {
      document.getElementById("location").textContent = "Error getting location.";
    },
    { enableHighAccuracy: true, timeout: 5000 }
  );
}
