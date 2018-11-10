var eventModal = document.querySelector(".event-modal");
var eventTrigger = document.querySelector(".event-trigger");
var eventCloseButton = document.querySelector(".event-close-button");

function eventToggleModal() {
    eventModal.classList.toggle("event-show-modal");
}

function eventWindowOnClick(event) {
    if (event.target === eventModal) {
        eventToggleModal();
    }
}

eventTrigger.addEventListener("click", eventToggleModal);
eventCloseButton.addEventListener("click", eventToggleModal);
window.addEventListener("click", eventWindowOnClick);