// script.js

document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('contact-form');

    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevents the default form submission

        const name = document.getElementById('name').value;
        const email = document.getElementById('email').value;
        const message = document.getElementById('message').value;

        // Simple form validation
        if (name && email && message) {
            alert(`Thank you for your message, ${name}! We will get back to you shortly.`);
            form.reset();
        } else {
            alert('Please fill out all fields.');
        }
    });
});
